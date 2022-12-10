package calen;
import java.util.Scanner;
import java.util.Calendar;
public class calen {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int idade;
         int ano_atual
         int ano_nascimento        
      
         System.out.println("digite sua idade: ")
         idade = entrada.nextInt();
         Calendar calendario = Calendar.getInstance();
         ano_atual=calendario.get(Calendar.YEAR);
         ano_nascimento= ano_atual - idade;
         System.out.printf("voce nasceu em " + ano_nascimento + "\n");
    }
    
}
