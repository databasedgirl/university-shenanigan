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

    Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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
}

