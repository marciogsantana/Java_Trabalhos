import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
    
      int numero1,numero2,contador,i;
      System.out.println("infomr o primeiro numero");
    
      numero1 = entrada.nextInt();
    
      System.out.println("infomr o segundo numero");
    
      numero2 = entrada.nextInt();
    
        if (numero1>numero2){   
      
            contador = numero1-numero2;   
           
            numero2 = numero2+1;
      
            while (contador>1){
      
              i=numero2++;
      
              contador--;
      
              System.out.println("os numeros sao " + i);
            }   
        }
        else if (numero1<numero2) { 
   
          contador = numero2-numero1;   
      
          numero1 = numero1+1;
      
          while (contador>1){
      
              i=numero1++;
      
              contador--;
      
              System.out.println("os numeros sao " + i);
          }       
        }          
        else {          
        
         System.out.println("o intervalo é 0");
        }          
              
              
              
    } 
}       