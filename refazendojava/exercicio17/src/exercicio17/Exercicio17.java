
package exercicio17;

import java.util.Scanner;

public class Exercicio17 {

  
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" informe o numero"); 
                
                
        int inicio = 0;
        
        int numero = entrada.nextInt();
        
        int cont, par, impar;
        
        cont = 0;
        
        if (numero > 0){
            
            while (cont < numero){
                
                               
                     inicio++;
                   
                   
                     if (inicio%2 != 0 ){
                
                      impar = inicio;
                    
                       System.out.println(" os numeros impares sao " + impar);
                
                
                      }  
            
                     else  {            
            
                       par = inicio;
                    
                       System.out.println(" os numeros pares sao " + par);
            
            
                    }
                   
                    cont++;
              }
    
        }
        else {
            
               System.out.println(" informe um valor valido");
              }
        
}        
    
}  