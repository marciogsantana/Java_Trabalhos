
package exercicio16;

public class Exercicio16 {

    public static void main(String[] args) {
    
        int numero, contador, trava;
        
        contador =0 ;
        
        numero = 0 ;
        
        while(contador < 100){
            
            numero++;
            
            if (numero%2 == 0){
                
                trava = numero;
                
                System.out.println(" os numero pares sao " + trava);
                
            }    
            
            contador++;
            
            
            
        }
        
        
        
    }
    
}