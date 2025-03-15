import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class chuva{ 
    //Em uma semana chuvosa podemos ter um grande acúmulo de chuva, o que pode provocar deslizamentos e enchentes. Elabore um algoritmo que solicite a quantidade de chuva ao longo de 5 dias (um valor para cada dia). Ao final o algoritmo deve imprimir a soma e a média dos valores lidos.
    public static void main(String[] args){
        Scanner get_rain_qtt = new Scanner(System.in);
        System.out.println("Insira a quantidade de chuva dos últimos 5 dias");
        int iteration_loop = 5;
        List<Float> qttList = new ArrayList<>();
        for(int i = 0; i<iteration_loop; i++){
            System.out.printf("Dia %d #>",i+1);
            float getqtts;
            getqtts = get_rain_qtt.nextFloat();
            
            qttList.add(getqtts);
        }
        
        //Fecha scan
        get_rain_qtt.close();
        
        int lastIDX = qttList.size();
        float rainSum = 0;
    
        for(int i = 0; i<lastIDX-1; i++){
            
               rainSum = Float.sum(rainSum,qttList.get(i));
        }
        System.out.printf("Total de chuva: %.2f\n",rainSum);
        System.out.printf("Média de chuva: %.2f",rainSum/lastIDX);
    }
}