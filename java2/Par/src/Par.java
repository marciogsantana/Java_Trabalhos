
import java.util.Scanner;
  
public class Par {
    
    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
    
          int numero,total;
          numero = entrada.nextInt();
      
           total = (numero%2);
      
           if (total ==0){        
             System.out.println("o numero é par)");
                         }
            else {   
              System.out.println("o numero é impar");
                         }
    
    }
    
}
