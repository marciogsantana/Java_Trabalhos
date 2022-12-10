
package exercicio6;


import java.util.Scanner;

public class Exercicio6 {

   
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
         System.out.println(" informe um numero");
        
            int numero, modulo ;
            
            numero = entrada.nextInt();
            
            
            modulo = 2010%19;
            
            System.out.println(" o modulo é " + modulo);
        
    }
    
}
