
package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    
    public static void main(String[] args) {
    
        
        Scanner entrada = new Scanner(System.in);
        
        int randomico, numero, cont;
        
        boolean chave = true;
        
        cont = 0;
        
        

        
        
        
        while (chave == true){
            
            randomico = (int) (Math.random() * 10);
            
            System.out.println("informe o numero");
        
             numero = entrada.nextInt();
            
              System.out.println("o numero aleatorio é " + randomico);
              
            if (randomico == numero){
        
              System.out.println("parabens voce acertou");
                    
              chave = false;        
            
              
              
            }
        
            else {

             System.out.println("tente novamnte");
             
             cont++;
             
             
            }
        
    }
 
        System.out.println("o numero de tentativas "+ cont);
        
}
} 