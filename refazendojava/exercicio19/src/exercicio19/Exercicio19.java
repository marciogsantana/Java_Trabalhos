
package exercicio19;


import java.util.Scanner;


public class Exercicio19 {

    public static void main(String[] args) {
    
         int numeros, maior, cont, trava, total, segundo;
         
         cont = 0;
         
         maior = 0;
         
         trava = 10;
         
         total = 0;
         
         segundo = 0;
         
         Scanner entrada = new Scanner(System.in);
         
         
         System.out.println(" informe  os numeros");
        
           while(cont < trava){
               
               numeros = entrada.nextInt();
               
                if (numeros > maior){
                    
                    segundo = total;
                    total = numeros; 
                    maior = numeros;                  
                    
                
                }
               
               
                
                
                
                
                cont++;
           }
        
        
        System.out.println(" os dois maiores numeros sao" + total + " e " + segundo);
           
    }
    
}
