import java.util.Scanner;

public class Contamarcio {
       
    public static void main(String[] args) {
    
      Scanner entrada = new Scanner(System.in);
      
      Contas minhaconta = new Contas();
      
        
          minhaconta.iniciarconta(4541244, 45547);
          
          System.out.println("informe o valor para deposito");
      
                        
          do 
                          
          {   
            
             minhaconta.depositar(entrada.nextInt()); 
              
              
             if (minhaconta.consultarsaldo() <= 0){ 
              
                 System.out.println("informe um valor valido");
            
             }
            
            
            
          } while ((minhaconta.consultarsaldo() <= 0));   
            
            
            
            System.out.println("informe o valor para saque");   
            
            
           
            
            do {
            
                
                minhaconta.sacar(entrada.nextInt());
                
                
               if (minhaconta.consultarsaldo() == minhaconta.consultarsaldo1()){
            
                  System.out.println(" saldo não disponivel tente novamente");
            
                }
               
               
            } while  ((minhaconta.consultarsaldo() == minhaconta.consultarsaldo1()));
               
               
        System.out.println("o saldo é " + minhaconta.consultarsaldo());   
            
    }
    
}
