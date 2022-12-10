
package projetomarcioaviao;

import java.util.Scanner;



public class Projetomarcioaviao {

 
    public static void main(String[] args) {
    
       
        
        lista listav = new lista();
                
        aviao aviao1 = new aviao();
        aviao1.setentrada(10, 20);
        
        aviao aviao2 = new aviao();
        aviao2.setentrada(40, 120);
        
        aviao aviao3 = new aviao();
        aviao3.setentrada(15, 200);
        
        listav.adicionarlista();
        listav.elementos();
        listav.numerolista();
        listav.saidaaviao();
        listav.numerolista();
        
        
}
    
}
