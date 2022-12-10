import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("informe o primeiro numero");
        
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
        
        
        numero2 = entrada.nextInt();
        
        if (numero1 > numero2){
        
          System.out.println("o maior numero é " + numero1);
        
        }
    
        else if(numero1< numero2){ 
        
          System.out.println("o maiorr  numero é " + numero2);
            
        }

        else {
        
             System.out.println("os numeros são iguais numero " + numero2 +" e numero " + numero1);
            
        }

        
    }
}    