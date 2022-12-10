
package exercicio11;


import java.util.Scanner;


public class Exercicio11 {

  
    public static void main(String[] args) {
        
                System.out.println (" equação do 2º grau ax^2 + bx +c = 0");
        
                Scanner entrada = new Scanner(System.in);
        
                System.out.println(" informa o valor de a");
        
                float a = entrada.nextFloat();
           
                System.out.println(" informa o valor de b");   
        
                float b = entrada.nextFloat();
        
                System.out.println(" informa o valor de c");
        
                float c = entrada.nextFloat();
        
                float delta, raiz1, raiz2, sqrtdelta;
          
                     delta = (b*b)- (4*a*c);
                
                     sqrtdelta = (float) Math.sqrt(delta);
                     
                     
                   if (a != 0){
                    
                       if (delta >= 0){
                       
                           raiz1 = (-b + sqrtdelta)/2*a;
                           raiz2 = (-b - sqrtdelta)/2*a;
                           
                           System.out.printf("raizes: %.2f e %.2f", raiz1, raiz2);
                           
                           
                       }
                       
                       else {
                       
                              delta = -delta;
                           
                              sqrtdelta = (float) Math.sqrt(delta);
                           
                              System.out.printf("raiz 1: %.2f + i.%2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                              System.out.printf("raiz 2: %.2f - i.%2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                           
                           }
          
          
             } else{
                       
                     System.out.println ("informe o coeficiente a valido ");
                       
                       
                       
                   }
    
}
}