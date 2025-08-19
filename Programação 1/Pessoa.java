import java.util.Calendar;
/*
 * Author: Databased (Ana)
 * Github: https://github.com/databasedgirl
 * Repo: https://github.com/databasedgirl/university-shenanigan
 */
public class Pessoa {
    private String nome;
    private int anoNascimento;
    public int calcularIdade(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - this.anoNascimento;
    }
    public String exibirNomeFormatado(){
        return this.nome.toUpperCase();
    }

    /* SET */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAno(int ano){
        this.anoNascimento = ano;
    } 

    /* GET */
    public String getNome(){
        return this.nome;
    }
    public int getAno(){
        return this.anoNascimento;
    }
    public String exibirDetalhes(){
        return String.format("Nome:\t%s\nIdade:\t%d\nAno de nascimento:\t%d", this.nome,calcularIdade(),this.anoNascimento);
    }
}
