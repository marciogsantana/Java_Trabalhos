
package testemetodoestatico;


public class carro {
   
    public static int total=0;
    
    carro(){
        total++;
        System.out.println("Objeto criado. Existem "+total+" objetos dessa classe"); 
        
        
       
    } 
    
    public int totalizador (){
        
        int t;
        
        t = total;
        
        return(t);
        
    }
    
    
}
