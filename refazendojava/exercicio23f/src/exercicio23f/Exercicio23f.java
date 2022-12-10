
package exercicio23f;

import java.util.Scanner;

public class Exercicio23f {

  
    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("informe o numero");
        
        int numero,media,total,cont,notas;
        
        total = 0;
        
        numero = entrada.nextInt();
        
        cont = numero;
                
        for (numero = numero; numero>0; numero--){
        
          System.out.printf(" informe a %d nota", numero);
        
              notas = entrada.nextInt();
        
              total = total + notas; 
    }
    
        
            media = total/cont;
        
        System.out.println(" a media é " + media);
        
}
}