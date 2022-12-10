
public class Fibonacci {

     static long fibo(int n) {
         
         if (n < 2) {
     
          return n;
          
          } else {
             
          return fibo(n -1) + fibo(n-2);   
             
         }
     
    } 
     
    public static void main(String[] args) {

        // teste do programa imprime os 30 primeiros termos
        
        long x;
        
        for (int i =0; i < 11; i++){  
        
        x = fibo(i);    
        
        System.out.println(" a sequencia é " + x);
        }
    }
}    