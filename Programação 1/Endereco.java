/*
 * Author: Databased (Ana)
 * Github: https://github.com/databasedgirl
 * Repo: https://github.com/databasedgirl/university-shenanigan
 */
public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    Endereco(String rua,int numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }
    public void atualizarEndereco(String rua,int numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }
    public String exibirEndereco(){
        return String.format("%s, %s %d",this.cidade,this.rua,this.numero);
    }
}
