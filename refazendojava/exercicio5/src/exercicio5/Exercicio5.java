
package exercicio5;

import java.util.Scanner;

import java.util.Calendar;


public class Exercicio5 {

   
    public static void main(String[] args) {

        int idade, ano_atual, ano_datanascimento, dia, mes, dianascimento, mesnascimento;
        
        System.out.println("informe sua idade");
        
        Scanner entrada = new Scanner(System.in);
        
        idade = entrada.nextInt();
        
        System.out.println("informe o mes que nasceu");
        
        mesnascimento = entrada.nextInt();
        
        System.out.println("informe o dia que nasceu"); 
        
        
        dianascimento = entrada.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        
        ano_atual = calendario.get(Calendar.YEAR);
        
        mes = calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        
        dia = calendario.get(Calendar.DAY_OF_YEAR);
        
       // System.out.println(" ano"  + "  "     + ano_atual);
       // System.out.println(" mes" +  "  "     + mes);
       // System.out.println(" dia" +  "  "     +dia);
        
        
        ano_datanascimento = ano_atual - idade;
        
        if (mesnascimento >=mes && dianascimento >= dia){
        
              System.out.println("o ano em que nasceu foi " + (ano_datanascimento - 1));
        }  
        
        else {
    
              System.out.println("o ano em que nasceu foi " + ano_datanascimento );    
            
             }
    }
}