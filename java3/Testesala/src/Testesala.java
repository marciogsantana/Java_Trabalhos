import java.util.Scanner;

public class Testesala {

     static int fibo(int n) {
         
         if (n<-1) {
     
           return (100);
          
         }
     
         else {    
             
             
             return (n++) ;
          
                
        } 
     } 
    public static void main(String[] args) {

        
        
        int x,i,m,soma;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o numero");
        
        x = entrada.nextInt();
        
        soma = 0;
        
        i = 0;
        
        m = 0;
        
        while (i<x){  
        
        i++;
        
            if (i%2 ==0){
            
            m = m + i;
                
            soma = soma + i;    
        
            m = fibo(m);    
        
        
            }
            
        }    
        
        
        
        System.out.println(" a sequencia é " + m);
        System.out.println(" a sequencia é " + i);
        System.out.println(" a sequencia é " + soma);
    }
}    