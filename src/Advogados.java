
public class Advogados extends Pessoa{
    private String oab;
    private String atuacao;

    


    public Advogados(String nome, String cpf, int idade,String oab, String atuacao ) {
            super(nome, idade, cpf);
            this.oab = oab;
            this.atuacao = atuacao;
    
    }




public void imprimiradvogado(){
    System.out.println();
}




public String getOab() {
    return oab;
}




public String getAtuacao() {
    return atuacao;
}




}
