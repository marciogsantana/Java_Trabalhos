import java.util.Scanner;

public class Operacaobanco {

       
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in); 
        
    Conta minhaconta = new Conta();
     
     minhaconta.iniciarconta(12455,5555);
     
     System.out.println("informe o valor para deposito");
     
            
        do
        
        {    
     
          minhaconta.deposito(entrada.nextInt());
         
        
          
             if (minhaconta.consultarsaldo() <= 0){
         
               System.out.println("informe um valor valido");
         
             }
     
    
        } while((minhaconta.consultarsaldo() <=0 ));
        
     System.out.println("informe o valor para saque");
     
     
     do
     
     {
     
     minhaconta.sacar(entrada.nextInt());
     
          if (minhaconta.consultarsaldo1() == minhaconta.consultarsaldo()){
     
           System.out.println("saldo não disponivel");
         
          }     
     
     } while((minhaconta.consultarsaldo1() == minhaconta.consultarsaldo()));  
     System.out.println("o numero da conta " + minhaconta.exibir());
     System.out.println("o numero da agencia " + minhaconta.exibirconta());
     System.out.println("o saldo " + minhaconta.consultarsaldo());














    
    
}
}