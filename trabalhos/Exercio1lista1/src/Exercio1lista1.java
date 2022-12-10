import java.util.Scanner;

public class Exercio1lista1 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o primeiro numero");
        
        int numero1,numero2,cont,saldo;
        
                
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
        
        numero2 = entrada.nextInt();
        
        if (numero1 > numero2){
        
        
           cont = numero1 - numero2;
        
           saldo = numero2 + 1 ;
           
           System.out.println("os nuemros são " + saldo);
           
           while (cont>2){
        
                  saldo = saldo + 1;
                  cont --;
                         
               System.out.println("os nuemros são " + saldo);
        
           }
        }
     

        else if (numero1 < numero2){
    
               cont = numero2 - numero1;
              
                saldo = numero1 + 1 ;
           
           System.out.println("os nuemros são " + saldo);
           
           while (cont>2){
        
                  saldo = saldo + 1;
                  cont --;
               
            System.out.println("os nuemros são " + saldo);   
    
               } 
    
        }
    
    
        else {
    
            System.out.println("os nuemros são identicos");
            
    }
}
}    