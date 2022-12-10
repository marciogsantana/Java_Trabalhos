
package exercicio24;

import java.util.Scanner;

public class Exercicio24 {

  
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        int n1,n2,n3,n4;
        
        
        System.out.println("informe o primeiro numero");
        
        n1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
        
        n2 = entrada.nextInt();
        
        
        System.out.println("informe o terceiro numero");
        
        n3 = entrada.nextInt();
        
        verificamaior v = new verificamaior();
        
        n4 = v.maioridade(n1, n2, n3);
        
        System.out.println(" o maior numero é " + n4);
        
        int n5 = v.maioridadev(n1, n2, n3);
        
        System.out.println(" o maior numero é " + n5);
        
        
        int n6 = v.menoridade(n1, n2, n3);
        
        System.out.println(" o mnor numero é " + n6);
    }
    
}
