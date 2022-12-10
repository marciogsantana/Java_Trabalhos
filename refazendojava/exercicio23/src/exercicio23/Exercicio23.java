
package exercicio23;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o numero");
        
        int numero, soma;
        
        numero = entrada.nextInt();
        
        
        nulo n = new nulo();
        
        soma = n.verificar(numero);
            
            if (soma == 0){
                
                System.out.println("o numero nulo");
                
            }
        
            else {
            
                System.out.println("o numero real");
            
            }
    
}
}