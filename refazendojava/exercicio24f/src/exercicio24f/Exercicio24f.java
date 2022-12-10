
package exercicio24f;

import java.util.Scanner;

public class Exercicio24f {

    
    public static void main(String[] args) {
   
        
        Scanner entrada = new Scanner(System.in);
        
        int numero,maior,trava,menor;
        
        numero = 10;
        
        maior = 0;
        
        menor = 0;
        
        for (numero = numero; numero>0; numero--){
        
        System.out.printf("informe o %d\n", numero) ;
        
             trava = entrada.nextInt();
        
          if (trava > maior){
              
              menor = maior;
              maior = trava;
            }     
             
          else if (trava < maior && trava > menor){
          
                  menor = trava;
    
          }           

        
        System.out.println(" o maiores  numeros sao " + maior + " " + menor);
    }
}
    
}    