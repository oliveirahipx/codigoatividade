public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cpf, String cnpj) {
        super(nome, idade, cpf);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }


}
