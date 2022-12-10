
package exercicio25;


public class aleatorio {
  
      int tata, tate,tata1,tata2,tata3; 
    
      int cont = 0;
      
    public int numero (){
    
      tata = (int) (Math.random() * 6);
        
      return(tata); 
}

   
      
    public int numero1 (){
    
      tata1 = (int) (Math.random() * 100000000);
        
      tata2 = tata1;
      
      tate = (int) (Math.random() * 100000000);
      
      tata3 = tate;
      
       if( tata2 == tata3){
           
           cont++;
       }
      
      return(cont); 
}
} 
