public class Divisao {

   public static int produto (int a, int b){
    
       int i,total;
     
       total = 0;
     
       while ( a>0 ){
     
          i = a - b;
       
          a = i;
    
          total  = total +1;
       
       }   
    
      return (total);
   }
    
 public static void main(String[] args) {
 
     int x;
     
     x = produto(12,3);
     
     System.out.println("o resulado da divisao é " + x)
     
     
     
     
    }
    
}
