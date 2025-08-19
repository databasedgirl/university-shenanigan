/*
 * Author: Databased (Ana)
 * Github: https://github.com/databasedgirl
 * Repo: https://github.com/databasedgirl/university-shenanigan
 */
public class Proprietario {
    private String nome;
    private Carro carro;
    private Endereco endereco;

    Proprietario(String nome,Carro carro,Endereco endereco){
        this.nome = nome;
        this.carro = carro;
        this.endereco = endereco;
    }

    public String exibirProprietarioECarro(){
        String marca = carro.getMarca();
        String modelo = carro.getModelo();
        String endereco = this.endereco.exibirEndereco();
        int ano = carro.getAno();
        return String.format("Proprietário:\t%s\nMarca:\t%s\nModelo:\t%s\nAno:\t%d\nEndereço:\t%s", this.nome,marca,modelo,ano,endereco);
    }
    public int compararAno(Carro compra){
        int ca = compra.getAno();
        int lca = carro.getAno();
        if(ca < lca){
            return ca; 
        }
        return lca;
    }

    /* GET */
    public String getNome(){
        return this.nome;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    public Carro trocarCarro(){
        return this.carro;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    public void mudarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
