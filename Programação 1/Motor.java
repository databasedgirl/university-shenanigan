/*
 * Author: Databased (Ana)
 * Github: https://github.com/databasedgirl
 * Repo: https://github.com/databasedgirl/university-shenanigan
 */
public class Motor {
    private String potencia;
    private String tipo;

    Motor(String potencia,String tipo){
        this.potencia = potencia;
        this.tipo = tipo;
    }
    public String exibirMotor(){
        return String.format("Potência:\t%s\nTipo:\t%s",this.potencia,this.tipo);
    }
}
