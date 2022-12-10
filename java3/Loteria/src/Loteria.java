import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int total;
        total = 0;        
        int vetor1[] = new int[6];
        int vetor2[] = new int[6];
            
        System.out.println("informe o numeros sorteados");
   
         for (int i=0; i<6; i++ ){
    
              vetor1 [i] = entrada.nextInt();
    
         }     
       
        System.out.println("informe o numeros do cartao");
    
         for (int i=0; i<6; i++ ){
    
              vetor2 [i] = entrada.nextInt();
    
         }    
    
         for (int i=0; i<6; i++ ){
   
                if (vetor1[i] == vetor2[i]){
    
                  total = total+1;
          
          
                }
    
        }
    
       System.out.println("voce acertou " + total);
    }      
         
}
