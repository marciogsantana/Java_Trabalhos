
import java.util.Scanner;

public class Numerosvetor {

    public static int comparacao (){
    
    Scanner entrada = new Scanner(System.in);
        
        int i,total,chave;
      
        total = 0;
      
        System.out.println("informe o numero para pesquisar");
        
        chave = entrada.nextInt();
        
               
        int vetor[] = new int[10];
    
        System.out.println("informe os numeros do vetor");
      
            for(i=0; i<10; i++){ 
                       
               vetor [i] = entrada.nextInt();
                           
                if (vetor[i] == chave){
                
                   total = total+1;
    
                }
    
            }    
    
       return(total);
    
    }

public static void main(String[] args) {
    
      int x;
      
      x = comparacao();
      
      System.out.println("o numero de repetição é  " + x );
    
    
    
    
}
    
}
