public class Ret {

     private int largura, altura;
    
       public Ret (){
    
        largura = 1; altura = 1;
        
       }  
    
          
      public void  altu (int altu){
          
          altura = altu;
       
      }  
       
     
      public int altura(){
    
         return(altura);
    
       }
      
           
      public void larg(int larg){
      
           largura = larg; 
      
      } 
      
    
        public int largura(){
          
          return(largura);
          
      }
      
      
      
      
      
      
      public int calculararea(){
    
    
         return(altura * largura);
       

      }



}
