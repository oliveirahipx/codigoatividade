import java.util.*;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//declaração de variaveis
        String nome;
        int idade;
        Boolean x = true;
        String y ="";
        String oab;
        String atuacao;
        int escolha = 0;
       
//criação da lista

        List<Advogados> advogado = new ArrayList<Advogados>();

System.out.println("*******************");
System.out.println("****Interface****");
System.out.println("*******************");
System.out.println("1 - Adicionar advogado");
System.out.println("2 - Adicionar cliente");
System.out.println("3 - ver detalhes de advogados ");
System.out.println("4 - ver detalhe de clientes");
escolha = sc.nextInt();


if (escolha == 1){
    do {

        //leitura de dados
       
       
               System.out.println("Digite seu nome:");
               nome = sc.nextLine();
       
               System.out.println("Digite sua idade:");
               idade = sc.nextInt();
       
               System.out.println("Digite seu Cpf:");
               sc.nextLine();
               String cpf = sc.nextLine();
       
               System.out.println("Digite sua Oab:");
               oab = sc.nextLine();
       
               System.out.println("Digite sua area de atuação:");
               atuacao = sc.nextLine();
       
       
       // adicionando advogados na array
               advogado.add(new Advogados(nome, cpf, idade, oab, atuacao));
       
       
          
               System.out.println("deseja sair? s/n");
               y = sc.nextLine();
             if( y.equals("s")) {
               x = false;
               System.out.println("fecha sistema");
               break;
               
           
             }
       //fim do Do while
           }while (x == true);
    }




//exibição de dados dos advogados

    for (Advogados advogados : advogado) {
        System.out.println(advogados.getNome());
        System.out.println(advogados.getIdade());
        System.out.println(advogados.getCpf());
        System.out.println(advogados.getOab());
        System.out.println(advogados.getAtuacao());
    }

       sc.close();
    }
}
