import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
    
     int menor,maior,soma,total,i;   
     
     soma = 0;
     maior = 0;
     menor = 0;
     Scanner entrada = new Scanner(System.in);
     
     int numeros [] = new int [5];
     
     System.out.println("informe os numeros");
     
     for (i=0; i<5;i++){    
     
         numeros[5] = entrada.nextInt();
         
         soma = soma + numeros[5];
     
         if (numeros[5]>maior){
         
            maior = numeros[5];
         }   
         
         if(numeros[5]<maior){
         
            menor = numeros[5];
         }   
     }
    

      total = soma/5;
    
      System.out.println("a media é " + total);
      System.out.println("o maior numero e " + maior);
      System.out.println("o menor numero e " + menor);
      System.out.println("os nuemros são  " + numeros[5]);
   
    
    }    
    
}