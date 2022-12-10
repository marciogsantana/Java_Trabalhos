
package exercicio14;


import java.util.Scanner;

public class Exercicio14 {

  
    public static void main(String[] args) {
    
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" informe o numero");
        
        
        int trava = entrada.nextInt();
        
        int cont = 0;
             if (trava >0){
                 
                 while (cont < trava){
                 
                 System.out.println(" fazendo a festa");
                  
                  cont++;
                 
                }
        
        
            }
    
             else {
                 
                 System.out.println("informe um valor valido");
             }
    
    
    }
}