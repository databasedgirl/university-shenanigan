/*
 * Script feito por Ana <3 (Databased)
 * Data: 13/06/2025
 * Github: https://github.com/databasedgirl
 */

import java.text.MessageFormat;
import java.util.*;
public class volei{

    /*
    Colete os dados: Para cada um dos 3 treinos, o programa deve pedir a quantidade de saques, bloqueios e ataques realizados pelo jogador.
    Calcule o total por treino: 
    Para cada treino, calcule o total de:  saques  + bloqueios + ataques realizadas pelo jogador e mostre o total na tela.
    Ao final deve ser apresentado na tela:
    - qual o treino com o maior número de interações feitas pelo jogador.
    -  a média de saques do jogador nos 3 treinos.
    */

    //Update de console
    public static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    // Configura titulo para tela
    public static void titulo(String titulo){
        clear();
        String v = "1.0";
        String esporte = "Vôlei";
        if(titulo == ""){
            System.out.println(MessageFormat.format("{0} ({1}) - {2}","Sistema de Treino",esporte,v)); 
            return;
        }
        System.out.println(MessageFormat.format("{0} ({1}) - {2} | {3}","Sistema de Treino",esporte,v,titulo));
        return;
    }
    // Coleta nome do jogador
    public static Scanner coleta_nome(){
        Scanner nome_participante = new Scanner(System.in);
        System.out.print("Nome do Jogador: ");
        titulo(nome_participante.nextLine());
        return nome_participante; //Retorna 'nome_participante' para que possa ser fechado junto com todos os outros scanners em Main, assim não causando problema com todos outros System.in's.
    }
    // Calcula Resultado do jogo
    public static Vector<String> calcula_res(int type, Vector<Vector<Integer>> vetor){
        int v_len = vetor.size();
        List<Integer> sub_lengths = new ArrayList<>(v_len);
        List<Integer> interacao_sort = new ArrayList<>(v_len);
        String maior_interacao = "";

        for(int i=0;i<v_len;i++){
            sub_lengths.add(vetor.get(i).size());
        }
        
        Vector <String> resultados = new Vector<String>();
        switch(type){
            case 1:
                int adder = 0;
                int total = 0;
                for(int i=0;i<v_len;i++){ // For principal para pegar numero de partidas
                    for(int i2=0;i2<sub_lengths.size();i2++){ // For secundario para pegar informação de cada partida
                        adder = adder+vetor.get(i).get(i2);
                        total = total+vetor.get(i).get(i2);
                    }
                    interacao_sort.add(adder);
                    
                    resultados.add(MessageFormat.format("Treino {0}: {1}",i+1,adder));
                    adder = 0;
                    
                }
                //guarda o maior numero e a partida
                int compare = 0;
                int iteracao = 0;
                for(int i=0;i<interacao_sort.size();i++){
                    if(interacao_sort.get(i) > compare){
                        compare = interacao_sort.get(i);
                        iteracao = i;
                    }
                }
                
                maior_interacao = MessageFormat.format("Maior interação: Treino {0} - {1}",iteracao+1,compare);
                resultados.add(maior_interacao);
                resultados.add(MessageFormat.format("Total: {0}",total));
                resultados.add(MessageFormat.format("Média: {0}",total/3));
        }
        
        return resultados;
    }

    public static void main(String[] args){
        //Coleta informações de cada partida
        Scanner saques = new Scanner(System.in);
        Scanner block = new Scanner(System.in);
        Scanner atk = new Scanner(System.in);

        //Guarda informação de cada partida em vetores
        Vector<Integer> treino_info = new Vector<>(3);

        //Guarda vetores com informação de partida
        Vector<Vector<Integer>> treinos_concat = new Vector<Vector<Integer>>(3);
        int treinos = 3;    
        
        titulo("");
        Scanner nome = coleta_nome();
        String divider = "";
        for(int i = 0; i<treinos;i++){ 
            /*
             * Mensagens contendo Quantidade de treinos setadas e numero do treino atual
             */
            String motd = MessageFormat.format("Treino: {0}/{1}",i+1,treinos);
            int motd_l = MessageFormat.format("Treinos: {0}",treinos).length();
            divider = MessageFormat.format("+-{0}-+","-".repeat(motd_l*2));
            System.out.println(divider);
            System.out.println(motd);
         
            System.out.print("Quantidade de saques: ");
            int s = saques.nextInt();
            System.out.print("Quantidade de bloqueios: ");
            int b = block.nextInt();
            System.out.print("Quantidade de ataques: ");
            int a = atk.nextInt();
            
            // Guarda informação no vetor "treino_info", guarda o vetor treino_info em treino_concat e limpa vetor treino_info
            treino_info.add(s);
            treino_info.add(b);
            treino_info.add(a);
            Object treino_info_clone = treino_info.clone();
             //Cast de Vetor do tipo integer no Objeto treino_info_clone já que treinos_concat apenas aceita vetores do tipo integer, e não objetos. (impossivel transformar treino_info_clone em vetor integer já que clone não aceita integer.)

            treinos_concat.add((Vector<Integer>) treino_info_clone); //POSSÍVELMENTE inseguro
            treino_info.clear();
            
        }
        //Fecha todos scanners
        nome.close();
        saques.close();
        block.close();
        atk.close();
        
        //Calcula Total de toques de cada treino e total de todos os treinos
        System.out.println(divider);
        Vector<String> resultados = calcula_res(1, treinos_concat);
        int resultados_l = resultados.size();
        for(int i=0;i<resultados_l;i++){
            System.out.println(resultados.get(i));
        }
    }
}