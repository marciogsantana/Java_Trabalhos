import java.util.Scanner;


public class Exercicio2poo {


    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaconta = new Conta();
        
        
        System.out.println("informe o numero da conta");
        
        minhaconta.dadosconta(entrada.nextInt());
        
        System.out.println("informe o numero da agencia");
        
        minhaconta.dadosagencia(entrada.nextInt());
        
        
        System.out.println("informe o valor do deposito");
        
        do {
        
          minhaconta.deposito(entrada.nextInt());
        
           if (minhaconta.saldo()<= 0 ){   
        
             System.out.println("informe um valor valido");
           
           
           }
           
           
         } while (minhaconta.saldo()<= 0); 
           
           
         System.out.println("informe o valor do saque");  
           
           
         do {
        
          minhaconta.sacar(entrada.nextInt());
        
           if (minhaconta.saldo == minhaconta.saldo1 ){   
        
             System.out.println("informe um valor valido");
           
           
           }
           
           
         } while (minhaconta.saldo == minhaconta.saldo1 );     
           
           
        System.out.println("numero agencia"     +          minhaconta.agencia     ());  
        System.out.println("numero da conta"    +          minhaconta.conta       ()); 
        System.out.println("valor depositado"   +   "R$" + minhaconta.deposito    ()); 
        System.out.println("valor do saque"     +   "R$" + minhaconta.sacar       ()); 
        System.out.println("saldo da conta"     +   "R$" + minhaconta.saldo       ()); 
           
           
           
           
           
           
           
    }
    
}
