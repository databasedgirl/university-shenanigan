/*
 * Script feito por Ana <3 (Databased)
 * Data: 11/04/2025
 * Github: https://github.com/databasedgirl
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p1{
    // Criar função para calcular desconto
    private static int calcula_desconto(int preco, int desconto, int qtd){
        if(desconto == 0){
            return 0;
        }
        if(qtd > 1){
            return preco*qtd*desconto/100;
        }
        return desconto*preco/100;

    } 
    

    public static void main(String[] args){
        System.out.println("[Filmes em cartaz]");
        System.out.println("[1]: Vingadores: Ultimato - R$ 30,00\n[2]: O Poderoso Chefão - R$ 25,00\n[3]: Divertida Mente 2 - R$ 28,00\n[4]: Sair");

        System.out.print("#> ");
        Scanner read_opt = new Scanner(System.in);
        int opt = read_opt.nextInt();
        int preco = 0;
        //Checando se opções são validas e aplicando preços em Int
        switch(opt){
            case 1:
                preco = 30;
                break;
            case 2:
                preco = 25;
                break;
            case 3:
                preco = 28;
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("[X] Opção inválida!\nEncerrando...");
        }
        // Abrindo scanner para quantidade de ingressos
        System.out.print("\n[*] Insira a quantidade de ingressos desejados.\n#> ");
        Scanner read_ingresso_qtd = new Scanner(System.in);
        int ingressos = read_ingresso_qtd.nextInt();
        /*
         * Criar array de opções válidas
         * Transformar Array em tipo Lista para que seja possível checar com função .contains()
         */
        String[] validas = {"s","n"};
        List<?> opcoes = Arrays.asList(validas);

        System.out.print("\n[?] O cliente é estudante [S/N]?\n#> ");
        Scanner read_estudante = new Scanner(System.in);
        String estudante = read_estudante.nextLine().toLowerCase();
        /* 
         * Loop infinito até que usuário decida parar de bobeira e botar sim ou não (s/n) 
        */
        while(!opcoes.contains(estudante)){
            System.out.println("[X] Aceitos: S/N.\n");
            System.out.print("\n[?] O cliente é estudante [S/N]?\n#> ");
            estudante = read_estudante.nextLine().toLowerCase();
        }

        System.out.print("\n[?] O cliente tem mais de 60 anos [S/N]?\n#> ");
        Scanner read_idoso = new Scanner(System.in);
        String idoso = read_idoso.nextLine().toLowerCase();
        
        while(!opcoes.contains(idoso)){
            System.out.println("[X] Aceitos: S/N.\n");
            System.out.print("\n[?] O cliente tem mais de 60 anos [S/N]?\n#> ");
            idoso = read_idoso.nextLine().toLowerCase();
        }
        // Declaração de variavel desconto com 0 default
        int desconto;
        desconto = 0;
        // Check true para aplicar descontos "dinâmicamente" de acordo com as escolhas do usuário
        if(estudante.toString().equals("s")){
            desconto = desconto+50;
        }
        if(idoso.toString().equals("s")){
            desconto = desconto+40;
        }
        
        // Fechar todos os listeners 
        read_idoso.close();
        read_estudante.close();
        read_opt.close();
        read_ingresso_qtd.close();

        // Chamar função de cálculo de desconto
        int desconto_calculado = calcula_desconto(preco,desconto,ingressos);

        // Criar Array para que a opção declarada do usuário no topo do programa seja usada para o display de nome de filme no recibo
        String[] cartaz = {"Vingadores: Ultimato","O Poderoso Chefão","Divertida Mente 2"};
        /* 
        * Se ingresso for maior que 1, o preço deve ser multiplicado pela quantidade de ingressos em duas instâncias
        * 1) Para display de preço normal
        * 2) Para display de preço com desconto sem que o valor vire um número negativo
        *
        * Output default é preço original sem ser multiplicado pela quantidade de ingressos, apenas sendo calculado o desconto normalmente
        */ 
        if(ingressos > 1){
            System.out.println("[+] Resumo da Compra [+]\n=========================");
            System.out.println(String.format("Filme: %s\nPreço: R$ %d,00\nIngressos:%d\nPreço Com Desconto: R$ %d,00\nDesconto Aplicado: R$ %d\n=========================",cartaz[opt-1],preco*ingressos,ingressos,preco*ingressos-desconto_calculado, desconto_calculado));
            return; 
        }
        System.out.println("[+] Resumo da Compra [+]\n=========================");
        System.out.println(String.format("Filme: %s\nPreço: R$ %d,00\nIngressos:%d\nPreço Com Desconto: R$ %d,00\nDesconto Aplicado: R$ %d\n=========================",cartaz[opt-1],preco,ingressos,preco-desconto_calculado, desconto_calculado));
    }
}

