
import java.util.Scanner;

public class Fatorialr {

    public static int calculadora(int x){
    
       if (x==0){
          
          return(1);
       
       }   
       else {    
    
        return(x * calculadora(x-1));
        
       }  
    
    }   
    public static void main(String[] args) {
    
        int x, fat;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("infome o valor do fatorial");
        
        x = entrada.nextInt();
        
        fat = calculadora(x);
        
        System.out.println(" o fatorial é " + fat);
        
        
        
        
    }
    
}
