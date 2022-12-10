
package exercicios11;

import java.util.Scanner;

public class Exercicios11 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, numero3, maior, menor;
        
        System.out.println("informe o primeiro numero");
        
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero numero");
        
        numero2 = entrada.nextInt();
        
        
        System.out.println("informe o terceiro numero");
        
        numero3 = entrada.nextInt();
        
        maior = 0;
        menor = 0;
        
        
        
        maior = numero1;
        menor = numero1;
        
        if (numero2 > maior){
            
            maior = numero2;
        }    
            
        else{
                
            menor = numero2;    
                    
        }
        
        if (numero3 > numero2 && numero3 > numero1){
            
            maior = numero3;
            
        }
        
        if (numero3 < numero1 && numero3 < numero2){
            
            menor = numero3;
        }
        
        
        System.out.println(" o menor numero é " + menor);
        System.out.println(" o maior numero é " + maior);
        
    }
    
}
