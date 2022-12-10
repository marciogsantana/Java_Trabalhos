
import java.util.Scanner;

public class Exercicio2s {

    public static int sub(int a, int b){
    
        int x, y, contador;
        
        contador = 0;
        
        x = a;
        
        y = b;
        
        while (x > 0){
        
            x = x - y;
            
            contador++;     
                    
        }    
            
        return(contador);         
    }    
    
    public static void main(String[] args) {
    
        int numero1, numero2, s;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o primeiro numero");
        
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
        
        numero2 = entrada.nextInt();
        
        s = sub(numero1,numero2);
        
        System.out.println("a divisao é " + s);
        
    }
    
}
