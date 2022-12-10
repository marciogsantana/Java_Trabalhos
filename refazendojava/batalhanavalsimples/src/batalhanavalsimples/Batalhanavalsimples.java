
package batalhanavalsimples;

    class  configurar{
    
        int [] localizacaocelulas;
        
        int numeroacertos = 0;
        
        public void setselecionar (int[] loc){
        
            localizacaocelulas = loc;
        }
    
        
        public String verificar (String jogar){
            
            int guess = Integer.parseInt(jogar);
            
            String result = "miss";
            
            for (int cell : localizacaocelulas){
            
                if (guess == cell){
                
                result = ("hit");
                
                numeroacertos++;
                
                break;
               }
            }
            
               if (numeroacertos == localizacaocelulas.length){
                   
                   result = ("kill");
               }
            
               System.out.println(result);
                  
               return(result);
            
        }
    }   
    public class Batalhanavalsimples {
    
    
     public static void main(String[] args) {
   
          configurar jogo = new configurar();
          
          int[] localizacaocelulas = {2,3,4};
          
          jogo.setselecionar(localizacaocelulas);
                  
         String userguess = "2";
         
         String result = jogo.verificar(userguess);
        
    }
    
}
