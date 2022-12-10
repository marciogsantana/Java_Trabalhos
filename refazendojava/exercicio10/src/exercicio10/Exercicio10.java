
package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

   
    public static void main(String[] args) {
    
        
        Scanner entrada = new Scanner(System.in);
        
        int nota;
        
        System.out.println("informa a sua nota");
        
        nota = entrada.nextInt();
        
        
        if (nota >4 && nota <7){
        
           System.out.println(" não desistea tente a prova de recuperação");
        
        }
        
        else if (nota < 5 ){
                
           System.out.println(" infelizemnte voe foi reprovado");
                
        }
        
        else {
    
            System.out.println("parabens voce foi aprovado");
                
                
        }
    
}
}