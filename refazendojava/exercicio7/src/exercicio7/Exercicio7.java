
package exercicio7;

import java.util.Scanner;


public class Exercicio7 {

   
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, media;
        
        
        System.out.println(" informe a primeira nota");
        
        nota1 = entrada.nextFloat();
                
        System.out.println(" informe a segunda nota");
        
        nota2 = entrada.nextFloat();
        
        
        System.out.println(" informe a terceira nota");
        
        nota3 = entrada.nextFloat();
        
        media = (nota1+nota2+nota3)/3;
        
         System.out.printf( "a media foi \n "  +  media );
         
        
        
    }
    
}
