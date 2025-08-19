import java.util.*;
/*
 * Author: Databased (Ana)
 * Github: https://github.com/databasedgirl
 * Repo: https://github.com/databasedgirl/university-shenanigan
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;
    private Proprietario proprietario;

    Carro(String marca, String modelo, int ano,Motor motor,Proprietario proprietario){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.proprietario = proprietario;
    }
    /* MÉTODOS SET */
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void atualizarAno(int ano){
        if(ano > Calendar.getInstance().get(Calendar.YEAR) || ano < 1885){
            this.ano = 1885;
        }
        this.ano = ano;
    }


    /* MÉTODOS GET */

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public Motor getMotor(){
        return this.motor;
    }
    /* MÉTODOS MISC */
    public String exibirDetalhes(){
        return String.format("Proprietário:\t%s\nMarca:\t%s\nModelo:\t%s\nAno do carro:\t%d\nMotor:\t%s",this.proprietario,this.marca,this.modelo,this.ano,this.motor);
    }
    public void substituirMotor(Motor motor){
        this.motor = motor;
    }
}
