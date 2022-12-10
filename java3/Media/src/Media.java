
public class Media {

    public static int sequencia(int a, int b){  
    
           int menor, maior,total,c,geral,contador;
        
           total = 0;
           
           contador = 0;
           
           if (a < b){
        
           menor = a;
           maior =  b;
           
           }  
    
           else {   
    
           menor = b;
           maior = a;
           
           }   
    
           c = menor;
           
          while(menor < maior){  

              menor++;
              
              total = total + menor;
          
              
              contador = contador+1;
          }     
              
            
             geral = (total + c + maior)/contador;
             
             return(geral);

    }





  public static void main(String[] args) {
  
     int x;
     
     x = sequencia(2,8);
     
     System.out.println("a media é " + x);
     
     
      
      
      
      
  }
    
}
