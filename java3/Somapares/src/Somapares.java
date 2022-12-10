import java.util.Scanner;

public class Somapares {

    
    public static int chama (){  
    
        Scanner entrada = new Scanner(System.in);
        
        int i,total;
      
        total = 0;
      
        int vetor[] = new int[10];
    
        System.out.println("informe os numeros do vetor");
      
            for(i=0; i<10; i++){ 
                       
               vetor [i] = entrada.nextInt();
      
                
                if (vetor[i] % 2 ==0){
    
                   total = total + vetor[i];
               
               }   
            }
            
      return(total);      
            
    }    
public static void main(String args[]){
   
        
       int x;
       
       x = chama();
       
       System.out.println("a soma dos numeros pares é " + x );
               
               
}    
}        
        
        
 