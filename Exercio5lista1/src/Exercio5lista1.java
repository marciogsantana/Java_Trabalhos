import java.util.Scanner;

public class Exercio5lista1 {

    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe os numero sorteados");
        
        int soma,c;
        
        soma = 0;
        
        int vetor[] = new int[6];
        
        for (int i=0; i<vetor.length; i++){
        
            vetor[i] = entrada.nextInt();
            
                      
        }
            System.out.println("informe os numeros do cartão");
        
             for (int i=0; i<vetor.length; i++){
            
                 c = vetor[i];
                 
             int numero = entrada.nextInt();
             
                                 
                 if (c == numero){
             
                   soma = soma + 1;         
    
                 }
    
             }
        
              System.out.println("voce acertou " + soma);
        
    }
}    