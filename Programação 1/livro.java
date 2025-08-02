import java.util.*;

class livro_info{
    public String nome="";
    public String autor="";
    public int ano=0;
    public boolean set_info(String n,String a,String an){
            try{
                Integer an_new = Integer.parseInt(an);
                this.nome = n;
                this.autor = a;
                int curr_year = Calendar.getInstance().getWeekYear();
                if(an_new > curr_year){
                    System.out.println(String.format("[ERRO] Ano \"%d\" inválido. Ano deve ser menor que o ano atual.",an_new));
                    return false;
                }
                this.ano = an_new;
                return true;
            }catch(java.util.InputMismatchException e){
                System.out.println("[ERRO] Ano deve conter apenas números.");
                return false;
            }catch(Exception e){
                System.out.println("[ERRO] Erro inesperado ocorreu. Favor contatar administração.");
                return false;
            }
        }
    }
    
    public class livro{
        public static void main(String[] args){
            Scanner read_user = new Scanner(System.in);
            String n,a,an;
            livro_info livro = new livro_info();
            
            System.out.println("##Administração::Biblioteca [v1.0-Alpha]##\n>Registrar novo livro\n");
            System.out.print("#Nome>\t");
            n = read_user.nextLine();
            System.out.print("#Autor>\t");
            a = read_user.nextLine();
            System.out.print("#Ano>\t");
            an = read_user.nextLine();
            
            if(livro.set_info(n, a,an)){
                System.out.println(String.format("##Livro registrado com sucesso!\nNome:\t%s\nAutor:\t%s\nAno:\t%d", livro.nome,livro.autor,livro.ano));
            }   
            read_user.close();
    }
}