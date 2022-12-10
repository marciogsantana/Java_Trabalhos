import java.util.Scanner;

public class Foda {

    public static void main(String[] args) {
    
        int menor,maior,soma,total,i;   
     
        soma = 0;
     
        maior = 0;
    
        menor = 10000000;
     
        Scanner entrada = new Scanner(System.in);
     
        int numeros [] = new int [5];
     
        System.out.println("informe os numeros");
     
        for (i=0; i<5;i++){    
     
         numeros[i] = entrada.nextInt();
         
         soma = soma + numeros[i];
     
            if (numeros[i]>maior){
         
                 maior = numeros[i];
            }   
         
              if (numeros[i]<menor){
         
                  menor = numeros[i];
              }   
        }
    

          total = soma/5;
    
          System.out.println("a media é " + total);
          System.out.println("o maior numero e " + maior);
          System.out.println("o menor numero e " + menor);
          System.out.println("O vetor da Posição 5 e: " + numeros[4]);
	  System.out.println("O vetor da Posição 4 e: " + numeros[3]);
	  System.out.println("O vetor da Posição 3 e: " + numeros[2]);
	  System.out.println("O vetor da Posição 2 e: " + numeros[1]);
	  System.out.println("O vetor da Posição 1 e: " + numeros[0]);		
    }
}    
    
    
         