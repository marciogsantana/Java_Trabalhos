import java.util.Scanner;

public class Exercicio4lista1 {

    
    public static void main(String[] args) {
    
        System.out.println("informe um numero");
        
         Scanner entrada = new Scanner(System.in);
        
        int numero = entrada.nextInt();
        
        
        System.out.println("informe os numero");
        
        int posicao,c;
        
        c = 0;
        
        posicao = 0;
        
        int vetor[] = new int [5];
        
        for (int i = 0; i < vetor.length; i++ ){
        
            vetor[i] = entrada.nextInt();
            
               
            if (vetor[i] == numero){
            
                c = vetor[i];
            
            }    
           
        }    
              
        System.out.println(" posicao é" + c) ;
        
            if (c == 0){
          
              System.out.println(" posicao nao encontrada");
             }
  
        }
}