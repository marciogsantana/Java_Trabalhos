
package jogoadivinhaomarciojavaprogressivo;

import java.util.Scanner;

public class Jogoadivinhaomarciojavaprogressivo {

    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        int tentativa, marcador1, teste, cont;
        
        cont = 1;
        
       adivinhar ad = new adivinhar();
       
       marcador1 = ad.getaleatorio();
       
       do{
       
      // System.out.println(marcador1);
       
       System.out.println("informe o palpite");
       
       tentativa = entrada.nextInt();
       
       teste= ad.getverificar(tentativa);
        
        
       
       
          if (marcador1 == teste){
            
            System.out.println(" parabens voce acertou o numero era " + marcador1+ "voce acertou em " + cont + " tentativas");
            
            
        } else if (teste > marcador1){
            
            System.out.println(" o numero é menor tente novamente");
            
        }
        
        else {
            
            System.out.println(" o numero é maior tente novamente");
        }
             
          cont++;
          
          
        }while(marcador1 != teste);  
          
    }
    
}
