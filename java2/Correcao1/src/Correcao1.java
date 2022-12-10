import java.util.Scanner;

public class Correcao1 {

        public static void executar (int numero){
         
          int i,total;
        
          for (i=1; i<=9; i++){
        
          total = numero*i;    
        
          System.out.println("numero x " + i + " = " + total );
          }
        }  
    
    
    
    public static void main(String[] args) {
       
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informar o numero para caluclo");
        numero = entrada.nextInt();
        executar (numero);
        System.out.println("informar o numero para caluclo");
        numero = entrada.nextInt();
        executar (numero);
    }
    
}
