
import java.util.Scanner;

 public class Exercicio4i {

    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
        
        float deposito,aplicacao,lucro,meses,total;
        
        aplicacao = 0.005f;
        
         System.out.println("informe o valor do deposito");
      
         deposito = entrada.nextFloat();
         
         System.out.println("informe o numero de meses ");
        
         meses = entrada.nextFloat();
        
         total = (deposito*aplicacao*meses);      
        
         lucro = (deposito+total)
         System.out.println(" o valor do juros mensal é " + lucro);
        
        
        
        
        
        
        
        
        
        
    }
    
}
