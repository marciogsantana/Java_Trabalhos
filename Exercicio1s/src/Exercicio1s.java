
import java.util.Scanner;

public class Exercicio1s {

    public static int sub (int a, int b){
    
        int x , y, soma;
        
        soma = 0;
        
        x = a;
        
        y = b;
        
        for (int i = 0; i <x; i++){
        
            soma = soma  + b;
        }    
            return(soma);
    }    
    public static void main(String[] args) {
     
        int s, numero1, numero2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o primeiro numero");
        
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
        
        numero2 = entrada.nextInt();
        
        s = sub(numero1,numero2);
        
        System.out.println("a soma é " + s);
        
    }
    
}
