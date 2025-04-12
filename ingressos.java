/*
 * Script feito por Ana <3 (Databased)
 * Data: 11/04/2025
 * Github: https://github.com/databasedgirl
 */

import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        System.out.print("[?] Usuário possui ingresso[S/N]: ");
        Scanner ri = new Scanner(System.in);
        String ingresso = ri.nextLine().toLowerCase();
        if(ingresso.toString().equals("n")){
            System.out.print("[X] Usuário não autorizado!\n[*] Razão: Sem ingresso.");
            System.exit(0);
        }
        System.out.print("[*] Insira sua idade: ");
        Scanner ridd = new Scanner(System.in);
        int idade = ri.nextInt();

        if(idade < 16){
            System.out.print("[X] Usuário não autorizado!\n[*] Razão: Idade menor que 16.");
            System.exit(0);
        }
        if(idade >= 16){
            System.out.print("[+] Usuário Autorizado!");
            System.exit(0);
        }
        ridd.close();
        ri.close();
    }
}
