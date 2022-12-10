
package testevetorjavaprogressivo;

import java.util.Scanner;

public class Testevetorjavaprogressivo {

    public static void exibirmatriz1(int [][] mat){
            
            for(int linha=0 ; linha < 3 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("\t %d \t",mat[linha][coluna]);
                }
                System.out.println();
               
            }
                
                
            
    }
    
    
    
    
    
    public static void main(String[] args) {
    
        
        int [] teste = new int[20];
        
        teste[0] = 25;
        
        teste [1] = 30;
        
        teste [2]= 10;
        
        teste[2]++;
        
        int tata = teste.length;
        
        int soma = teste[0]+ teste[1];
        
        
        System.out.println(" o tamanho do vetor é " + tata + soma);
        
        System.out.println(" o tamanho do vetor é " +  soma);
        
        System.out.println(" o tamanho do vetor é " +  teste[2]);
       
        int [] nota = new int [3];
        
        Scanner entrada = new Scanner(System.in);
        
        for (int indice = 0; indice < 3; indice++){
            
            System.out.println("informe os numeros");
            
           nota[indice] = entrada.nextInt();
        
        }
        
        for (int indice = 0; indice < 3; indice++){
            
            System.out.printf(" os indices %d \nnumeros sao %d \n", indice, nota[indice]);
            
            
        }
        
        for (int i : nota){
            
            int n = i;
            
            System.out.println(" numeros " + n);
            
            
        }
        
        
        int matriz[][] = new int[3][3];
        
           System.out.println(" matriz m[3][3]");
                 
                
               for (int linha =0 ; linha < 3; linha ++){
                   
                   for (int coluna = 0; coluna <3 ; coluna++){
                                                                 
                   
                     System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                     matriz[linha][coluna] = entrada.nextInt();
                   
                   }
        
        
                }
        
               System.out.println("\nA Matriz ficou: \n");
            for(int linha=0 ; linha < 3 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("\t %d \t",matriz[linha][coluna]);
                }
                System.out.println();
               
            }
           System.out.println("informando a matriz usando o metodo");
           
           
           exibirmatriz1(matriz);
            
    
}

}