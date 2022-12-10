import java.util.Scanner;

public class Exemploapostila {

   public static int calculaFatorial(int x){
      if(x==3) {
         return(1);
      } else {
         return(x * calculaFatorial(x-1));
      }
   }

   public static void main(String args[]){
      int x, fat;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite um numero inteiro:");
      x = entrada.nextInt();
      fat = calculaFatorial(x);
      System.out.println("O fatorial eh: " + fat);
   }
}

