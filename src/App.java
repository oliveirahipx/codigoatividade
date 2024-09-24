import java.util.*;

public class App {
    public static List<Advogados> advogado = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Caso> casos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int escolha = 0;

        while (escolha != 7) {
            System.out.println("*******************");
            System.out.println("*****Interface*****");
            System.out.println("*******************");
            System.out.println("1 - Adicionar advogado");
            System.out.println("2 - Adicionar cliente");
            System.out.println("3 - ver detalhes de advogados ");
            System.out.println("4 - ver detalhe de clientes");
            System.out.println("5 - Registrar casos");
            System.out.println("6 - Exibir casos");
            System.out.println("7 - Sair ");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                cadastroAdvogado();
            } else if (escolha == 2) {
                cadastroCliente();
            } else if (escolha == 3) {
                exibirAdvogados();
            } else if (escolha == 4) {
                exibirClientes();
            }else if (escolha == 5){
                registrarCaso();
            }else if (escolha == 6){
                exibirCasos();
            }
        }
        sc.close();
    }



                // Método para registrar casos
                public static void registrarCaso() {
                    clear();
                    System.out.println("Selecione o advogado:");
                    for (int i = 0; i < advogado.size(); i++) {
                        System.out.println((i + 1) + " - " + advogado.get(i).getNome());
                    }
                    int advogadoIndex = sc.nextInt() - 1;
                    sc.nextLine();
            
                    System.out.println("Selecione o cliente:");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println((i + 1) + " - " + clientes.get(i).getNome());
                    }
                    int clienteIndex = sc.nextInt() - 1;
                    sc.nextLine();
            
                    System.out.println("Digite a descrição do caso:");
                    String descricao = sc.nextLine();
            
                    System.out.println("Digite a data de início (dd/MM/yyyy):");
                    String dataInicio = sc.nextLine();
            
                    String status = "Em andamento"; // Status inicial
            
                    Caso caso = new Caso(descricao, advogado.get(advogadoIndex), clientes.get(clienteIndex), status, dataInicio);
                    casos.add(caso);
            
                    System.out.println("Caso registrado com sucesso!");
                    System.out.println("Pressione Enter para retornar.");
                    sc.nextLine();
                    clear();
                }
            
                // Método para exibir casos
                public static void exibirCasos() {
                    clear();
                    System.out.println("Casos cadastrados:");
                    for (Caso caso : casos) {
                        System.out.println("Descrição: " + caso.getDescricao());
                        System.out.println("Advogado: " + caso.getAdvogado().getNome());
                        System.out.println("Cliente: " + caso.getCliente().getNome());
                        System.out.println("Status: " + caso.getStatus());
                        System.out.println("Data de Início: " + caso.getDataInicio());
                        System.out.println("Data de Fim: " + caso.getDataFim());
                        System.out.println("-----------------------------");
                    }
                    System.out.println("Pressione Enter para retornar.");
                    sc.nextLine();
                    clear();
                }
    //clear console
    public static void clear() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Cadastro de advogados
    public static void cadastroAdvogado() {
        String nome;
        int idade;
        String cpf;
        String oab;
        String atuacao;
clear();
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.println("Digite seu Cpf:");
        cpf = sc.nextLine();

        System.out.println("Digite sua Oab:");
        oab = sc.nextLine();

        System.out.println("Digite sua area de atuação:");
        atuacao = sc.nextLine();

        advogado.add(new Advogados(nome, cpf, idade, oab, atuacao));
        System.out.println("Pressione Enter para Retornar");
        sc.nextLine();
        clear();
                for (int i = 5; i > 0; i--) {
                    clear();
                    System.out.println( "Processando dados do Advogado Aguarde: "+i);
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        System.err.println("O processo foi interrompido.");
                        e.printStackTrace();
                   
                    }
                    clear();
                    System.out.println("OK! Advogado " + nome+ " Cadastrado");
                }
            }

        
    
//Cadastro de clientes
    public static void cadastroCliente() {
        clear();
        System.out.println("Digite 1 para Pessoa Física ou 2 para Pessoa Jurídica:");
        int tipoCliente = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite seu CPF:");
        String cpf = sc.nextLine();

        if (tipoCliente == 1) {
            clientes.add(new PessoaFisica(nome, idade, cpf));
        } else if (tipoCliente == 2) {
            System.out.println("Digite seu CNPJ:");
            String cnpj = sc.nextLine();
            clientes.add(new PessoaJuridica(nome, idade, cpf, cnpj));
        }
        for (int i = 5; i > 0; i--) {
            clear();
            System.out.println( "Processando dados do Cliente Aguarde: "+i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.err.println("O processo foi interrompido.");
                e.printStackTrace();
           
            }
            clear();
            System.out.println("OK! Cliente " + nome+ " Cadastrado");
        }
    }




//exibir clientes
    public static void exibirClientes() {
        clear();
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
            System.out.println(cliente.getIdade());
            System.out.println(cliente.getCpf());
            if (cliente instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) cliente).getCnpj());
            }
            System.out.println("Pressione Enter para Retornar");
            sc.nextLine();
            clear();
        }
    }
//exibir advogados
    public static void exibirAdvogados() {

        for (int i = 3; i > 0; i--) {
            clear();
            System.out.println( "Carregando Advogados Cadastrados aguarde "+i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.err.println("O processo foi interrompido.");
                e.printStackTrace();
           
            }
            clear();
            System.out.println("Advogados cadastrados:");
        }
        for (Advogados advogados : advogado) {
            System.out.println("Nome: " +advogados.getNome());
            System.out.println("Idade: " +advogados.getIdade());
            System.out.println("Cpf: " +advogados.getCpf());
            System.out.println("Oab: " +advogados.getOab());
            System.out.println("Atuação: " +advogados.getAtuacao());
            System.out.println("Pressione Enter para Retornar");
            sc.nextLine();
            clear();
        }




        
}
}
