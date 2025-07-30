/*
 * Declare um vetor de inteiros e armazene os seguintes valores dentro dele
 * {1,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95}
 * Pergunte ao usuário qual número ele deseja procurar dentro do vetor.
 * Busque o número do vetor e informe em que posição do vetor (índice) o
    número procurado está. Caso ele não seja encontrado, informe -1.
 */

import java.util.*;

public class vec {
    private static int valida(String num){
        Integer armazem[] = {1,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95};
        int conv;
        int idx;
        try{
            conv = Integer.parseInt(num);
            idx = Arrays.asList(armazem).indexOf(conv);
            return idx;
        }catch(Exception e){
            return -2;
        }
    }
    public static void main(String[] args){
        
        Scanner get_input_idx = new Scanner(System.in);
        String raw_num;
        System.out.print("Informe o valor que deseja procurar: ");
        raw_num = get_input_idx.nextLine();
        int ret = valida(raw_num);
        
        switch(ret){
            case -1:
                System.out.println(String.format("[X] Número %s não existe.",raw_num));
                break;
            case -2:
                System.out.println(String.format("[X] Erro ao processar input: %s",raw_num));
                break;
            default:
                System.out.println(String.format("Valor::\t%s\nIndex::\t%d",raw_num,ret));
                break;
        }
        
        get_input_idx.close();
    }
}
