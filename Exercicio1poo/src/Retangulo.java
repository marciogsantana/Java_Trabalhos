
public class Retangulo {
    
    private int altura,largura;

      public Retangulo (){

       altura = 1;
       largura = 1;

      }

      public int getaltura(){

        return(altura);

      }
      
      
      public void setaltura(int alt){
      
           if (alt > 1){
          
          
              altura = alt;
      
           }
      }
      
      public int getlargura(){
      
         return(largura);
         
      }    
      
      
      public void setlargura(int lar){      

          if (lar >1){

           largura = lar;

          }
          
      }
      
      
      public int calculararea(){     
      
         return (largura * altura);
      
      
      }
      
      
      public int calcularperimetro(){
      
      
          return(2 * altura + 2 * largura);
      }     
      
      
      public int largura(){
      
         return (largura);
      
      
      }
      
      
      public int altura(){
          
         return(altura); 
          
      }
      
}      
      