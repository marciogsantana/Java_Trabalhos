
package exercicio22;


import java.util.Scanner;

public class Exercicio22 {

    
    
    public static void testar (int numero){
        
        int numero1 = numero;
        
           if( numero1 > 0){
               
               
               System.out.println(" o numero é positivo");
           }
        
           else if (numero1 < 0) {
        
                System.out.println(" o numero é negativo");
        
              }
    
           else {
           
           System.out.println(" o numero é zero");
           
    }
    
    }       
    public static void main(String[] args) {
    
        
               
        int tata;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o numero");
        
        int inteiro = entrada.nextInt();
        
        
         testar(inteiro);
        
        
        
        
        
        
        
    }
    
}
