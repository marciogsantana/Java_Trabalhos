import java.util.Scanner;
public class Testevetor {

    public static void main(String[] args) {
       
     int vetor[] = new int [7];
     int i;
     Scanner entrada = new Scanner(System.in);
     for (i=0; i<vetor.length; i++){
        System.out.println("digites oum numero");
         vetor[i] = entrada.nextInt();
          
     }
       System.out.println("o vetor é " + vetor[i]); 
    }
}