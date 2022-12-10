import java.util.Scanner;
public class Mediam {

    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
     
     int numeros,cont,maior;
     System.out.println("infome os 10 numeros");
     numeros = entrada.nextInt();
     maior = numeros;   
     cont = 9;
     while (cont>=1){
        numeros = entrada.nextInt();
            if (numeros>maior){
                 maior = numeros;
            } 
        cont = (cont-1);
            
    }
      System.out.println("o maior numero é " + maior);
    
    }
    
}
