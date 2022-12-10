import java.util.Scanner;

public class Comparavetor {

    public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);
     
         int vetor[] = new int[5];
     
         int chave,total,i;
     
         total = 0;
     
         System.out.println("informe o nuemro para comparacao");
     
         chave = entrada.nextInt();
     
         System.out.println("informe os numeros");
     
        for (i=0; i<5; i++){

             vetor[i] = entrada.nextInt();
         
             if (vetor[i] == chave){
         
                total = total + 1;
             }
      
             else{
    
                 System.out.println("numero nao encontrado");
        
             }

       
        }     
         System.out.println("a chave aparece no vetor" + total);





    }
    
}
