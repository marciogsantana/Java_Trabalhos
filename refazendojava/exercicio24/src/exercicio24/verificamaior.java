
package exercicio24;

import java.util.ArrayList;

import java.util.Collections;

public class verificamaior {

    int valor, total;
    
    
   public int maioridade  (int numero1, int numero2, int numero3){
       
       valor = Math.max(numero1, numero2);
       
       total = Math.max(valor, numero3);
       
       
       return(total);
       
   }
    
    
    public int maioridadev  (int numero1, int numero2, int numero3){
   
             
         ArrayList marcio = new ArrayList();
   
           marcio.add(numero1);
           marcio.add(numero2);
           marcio.add(numero3);
           
           
        return  (int) (Collections.max(marcio));
   
        
   
   
}    
    
    public int menoridade  (int numero1, int numero2, int numero3){
   
             
         ArrayList marcio = new ArrayList();
   
           marcio.add(numero1);
           marcio.add(numero2);
           marcio.add(numero3);
           
           
        return  (int) (Collections.min(marcio));
   
    
    
    
    
    
    
    
    
    
}    

}