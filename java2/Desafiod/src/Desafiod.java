import java.util.Scanner;

 public class Desafiod {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    int numero,chave ;
    
    chave = 9;
            
    System.out.println("informe o numero correto e veja um diamante");
    
     numero = entrada.nextInt();
    
        if (numero == chave){
           
            System.out.println("*");
            System.out.println("***");
            System.out.println("*** ***");       
            System.out.println("****  *****");
            System.out.println("*** ***");
            System.out.println("***");
            System.out.println("*");
        
         }
         else { 
     
            System.out.println("tente novamente");       
         }
      
    }
 }   
       