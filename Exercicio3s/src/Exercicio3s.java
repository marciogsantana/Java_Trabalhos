
import java.util.Scanner;

public class Exercicio3s {

   public static int sub(int a, int b){
    
       int x, y, s;
       
       x = a;
       
       y = b;
       
       s = x;
       
       x = x * x;
       
       for (int i = 0 ; i < (b-2); i++ ){
       
               
         x = x * s;
       
       }
    
     return(x);  
   }   
       
    public static void main(String[] args) {
    
        int numero1, numero2, s;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o primeiro numero");
        
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
    
        numero2 = entrada.nextInt();
        
        s = sub(numero1,numero2);
        
        System.out.println("a potencia é" + s );
        
    }
    
}
