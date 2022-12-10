
package testearraymarcio;

import java.util.ArrayList;


 public class Testearraymarcio {

   
    public static void main(String[] args) {
     
     
        
        
        ArrayList matrizmarcio = new ArrayList();
        
       
        matrizmarcio.add(10);
        matrizmarcio.add(20);
        matrizmarcio.remove(1);
        matrizmarcio.add(50);
        matrizmarcio.add(35);
        int tamanho = matrizmarcio.size();
        System.out.println(matrizmarcio);
         System.out.println(tamanho);
    }
    
}
