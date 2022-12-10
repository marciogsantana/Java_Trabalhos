public class Correcao2 {

        public static void executar (int numero){
         
          int i,total;
        
          for (i=1; i<=9; i++){
        
          total = numero*i;    
        
          System.out.println("numero x " + i + " = " + total );
          }
        }  
    
    
    
    public static void main(String[] args) {
       
        int numero;
        executar(8);
        executar(9); 
    }
    
}
