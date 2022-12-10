
import java.util.Scanner;

public class Fatorial {

    
    public static void main(String[] args) {
    
       int resultado = 1;
       
       for (int aux = 5; aux > 1; aux--){
           
           resultado = resultado*aux;
           
       }
    
       System.out.println(" o fatorial de 5 é " + resultado);
       
}

}    