import java.util.Scanner;
  
   public class Teste1 {

       public static void main(String[] args) {

        int cont,numero,menor;
         menor = 1000;
         
         System.out.println("informe quantos numeros serao digitados");
         
         Scanner entrada = new Scanner(System.in);
         
         cont = entrada.nextInt();
   
         while(cont>0) {
         
          System.out.println("informe os nuemros");
         
          numero = entrada.nextInt();
       
           if (numero <= menor){  
              menor = numero;
           }
          cont--; 
         }    
 System.out.println("o menor numero é " + menor);

       }
  }