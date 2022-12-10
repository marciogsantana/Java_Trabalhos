import java.util.Scanner;

public class Somar {
  
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);   
    
    int primeiro,segundo,soma,multiplique,modulo;
    
    System.out.println("informe o primeiro numero");
    primeiro = entrada.nextInt();
    
    System.out.println("informe o segundo numero");
    segundo = entrada.nextInt();
            
    soma = (primeiro + segundo);        
    
    multiplique = (primeiro*segundo);        
            
    modulo = (primeiro%2);
 
    System.out.println(" o resultado da soma é " + soma);
    System.out.println(" o resultado da multiplicacao é " + multiplique);
    System.out.println(" o resultado do modulo  é " + modulo);        
    
    }

}