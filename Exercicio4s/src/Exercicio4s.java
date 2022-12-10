
import java.util.Scanner;

public class Exercicio4s {

    public static int sub (int a, int b){
        
        int x , y, soma, fator, contador, media, div, r ;
        
        media = 0;
        
        x = a;
        
        y = b;
        
        soma = x + y;
        
        if (x > y){
        
            fator =  x - y;
          
            div = fator;
        
            r = 2;
            
            for (contador = div; contador < x; contador++){
        
               fator ++;
               
               r++;
               
               soma = soma + fator;
            } 
        
            
             media = soma/r;
               
          return(media);
        
        }  
        else {
            
             fator = y - x; 
            
             div = fator;
             
             r = 2;
        
             for (contador = div; contador < x; contador++){
        
               fator ++;
               
               r++;
               
               soma = soma + fator;
             } 
           
              media = soma/r;
           
        }   
        
    
           return(media);
    }    
        
    public static void main(String[] args) {
 
      Scanner entrada = new Scanner(System.in);
      
      int numero1, numero2, s;
      
      
      System.out.println("informe o primeiro numero");
      
      
      numero1 = entrada.nextInt();
     
        
      System.out.println("informe o segundo numero");  
        
      numero2 = entrada.nextInt();
        
        
        s = sub(numero1,numero2);
        
     System.out.println("a media é " + s);     
        
        
        
    
    
    }
    
}
