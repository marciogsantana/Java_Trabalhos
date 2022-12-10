
package livro;

 class book{
            
            String titulo;
            String autor;
}


public class Livro {
   
    public static void main(String[] args) {
     
      book[] teste = new book[3];          
        
      teste[0] = new book();  
      teste[1] = new book();
      teste[2] = new book();
      
      int x  = 0;
      
      teste[0].titulo = " marcio";
      teste[1].titulo = " gomes";  
      teste[2].titulo = " santana";  
      
      teste[0].autor = "laura";
      teste[1].autor = "toledo";
      teste[2].autor = "juliane";
      
      while( x < 3){
      
            System.out.println(teste[x].titulo);
            System.out.println ("by");
            System.out.println(teste[x].autor);
            x = x +1;
            
      }
    
}
}