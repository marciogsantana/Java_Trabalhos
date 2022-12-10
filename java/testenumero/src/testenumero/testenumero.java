package testenumero;

import java.util.Scanner;

public class testenumero {

public static void main(String[] args) {
        
Scanner entrada = new Scanner(System.in);      
        
     int num1, num2, num3
     System.out.println("informe o primeiro numero")
     num1 = entrada.nextInt()
     System.out.println("informe o segundo numero")       
     num2 = entrada.nextInt()
     System.out.println("informe o terceiro numero")
     num3 = entrada.nextInt()
             
     if (num1 > num2 && num1 > num3){
         System.out.println("o maior numero é o numero " + num1 );
     }
       else if (num2 > num1 && num2 > num3){    
         System.out.println("o maior numero é o numero " + num2 );
          }
          else if (num3 > num1 && num3 > num2) {    
            System.out.println("o maior numero é o numero " + num3 );  
          }
          
           
            
        
    }
    
}
