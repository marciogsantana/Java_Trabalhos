public class Ret {

     private int largura, altura;
    
       public Ret (){
    
        largura = 1; altura = 1;
        
       }  
    
          
      public void  setaltu (int altu){
          
          altura = altu;
       
      }  
       
     
      public int getaltura(){
    
         return(altura);
    
       }
      
           
      public void setlarg(int larg){
      
           largura = larg; 
      
      } 
      
    
        public int getlargura(){
          
          return(largura);
          
      }
      
      
      
      
      
      
      public int getcalculararea(){
    
    
         return(altura * largura);
       

      }



}
