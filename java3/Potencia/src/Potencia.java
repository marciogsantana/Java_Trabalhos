
public class Potencia {

    public static int produto (int a, int b){
    
       int i,total;
     
       total = a;
     
        for (i=1; i<b; i++){
     
          total = total * a;
        
          
          
        }   
    
      return (total);
    }
    
  public static void main(String[] args) {
 
     int x;
     
     x = produto(2,8);
     
     System.out.println("o resulado da multiplicacao é " + x)
    
  }  
    
}    