package exercicio25f;

import java.util.Random;

public class Exercicio25f {

    public static void main(String[] args) {
    
        Random aleatorio = new Random();
        
                
        for (int cont = 1; cont < 20; cont++ ){
        
            int numero = aleatorio.nextInt(1000) + 1000;
            
            System.out.println("os numeros sao" + numero );
            
             if (numero%11 == 5){
    
                 int total = numero;
                 
                System.out.println("o resultado é" + total);
             
             
             }
    
}
        
    }        
}