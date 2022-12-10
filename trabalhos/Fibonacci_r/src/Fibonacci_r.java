public class Fibonacci_r { 

   public static int calcular(int n) { 
   
      if (n < 2) { 
        return n; 
      } else { 
        return ( calcular(n - 1) + calcular(n - 2) ); 
      } 
      
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

