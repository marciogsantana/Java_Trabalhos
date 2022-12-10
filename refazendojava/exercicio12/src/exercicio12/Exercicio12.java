
package exercicio12;

import java.util.Scanner;


public class Exercicio12 {

   
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        
        int numero, ve;
        
        System.out.println("informe o numero");
        
        numero = entrada.nextInt();
        
        ve = numero%2;
        
        if (ve == 0){
        
           System.out.println("o numero informado é par");
        
        }   
        else{
    
              System.out.println("o numero informado é impar");        
                   
           }
           
           
           
           
    
}
}