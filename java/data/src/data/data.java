package data;
import java.util.Scanner;
public class data {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int idade;
      
      System.out.println("digite sua idade: ")
      idade = entrada.nextInt();
      
      System.out.printf("sua idade é " + idade + "\n");
    }
    
}
