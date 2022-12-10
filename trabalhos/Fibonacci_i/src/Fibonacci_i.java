public class Fibonacci_i{ 

   public static int calcular(int n) { 
     
     int atual    = 0;
     int anterior = 0;

     for (int i = 1; i <= n; i++) { 
     
        if (i == 1) { 

          atual = 1; 
          anterior = 0; 

        } else { 

          atual = atual + anterior; 
          anterior = atual - anterior; 
        } 
        
     } 

     return atual; 
   } 

   public static void main(String[] args) { 

      int termo;
      
      /* Imprimindo os primeiros 10 termos */
      
      for (int i = 0; i < 10; i++) { 
         termo = calcular(i);
         System.out.println(termo + " , "); 
      } 
     
   }

}
