
package aplicacaobancaria;

import java.util.Scanner;



public class Aplicacaobancaria {

    public static void main(String[] args) {
  
        int numeroconta;
        String nomeconta;
        int valorinicial;
        int opcao = 0;
        int deposito = 0;
        int saque = 0;
        int chave = 0;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" infome o nome da conta conta");
        
        nomeconta = entrada.nextLine();
        
        System.out.println(" infome o valor inicial");
               
        valorinicial = entrada.nextInt();
        
        numeroconta = (int) (Math.random() * 400);
        
        
        conta inicio = new conta();
        
        inicio.setiniciarconta(nomeconta, numeroconta, valorinicial);
        
        do {
        
        inicio.exibimenu();
        
        System.out.println(" infome uma opção");
        
        
        
        
            
        opcao = entrada.nextInt();
            
        switch (opcao)
        
        {
        
            case 1 :
                
                System.out.println(" informe o valor a depositar");
                
                
                deposito = entrada.nextInt();
                 
                   if (deposito > 0 ){  
                
                    inicio.setdeposito(deposito);
                
                   }
                    
                   else {   
                   
                         System.out.println(" informe um valor valido");
                         
                 }
                
            break;
        
        
            case 2 :
                
                System.out.println(" informe o valor para saque");
                   
                    saque = entrada.nextInt();
                
                  if (saque > 0 ){  
                
                    inicio.setsacar(saque);
                
                   }
                    
                   else {   
                   
                         System.out.println(" informe um valor valido");
                         
                 }
                
            break;  
        
        
            case 3 :
                
                    inicio.extrato();
                
            break;
                
                
            case 4 :
                
                System.out.println("obrigado e volte sempre");
                chave = 1;
              
                break;
                
            default :
                
                System.out.println(" informe uma opção valida");
                
                break;
                
           }        
                
    }while (chave == 0);
    
    
    }
    
}
