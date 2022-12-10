
public class Contas {
    
   private int conta, agencia, saldo, saldo1;

        public void iniciarconta(int numero, int ag){
         
          conta = numero;
          
          agencia = ag;
          
          saldo = 0;
          
          saldo1 = 0;

        }


        public void depositar (int valor) {
      
          if (valor > 0){
      
             saldo = saldo + valor;
            
          }
       
        }  

          public int consultarsaldo (){ 
         
             return (saldo);

        }
             
               
         
        public void  sacar (int valor) {       
             
             if (valor <= saldo){
                 
                 saldo = saldo - valor;
                 
             } 
            
             else { 
             
                saldo1 = saldo;
             
             }
        
        
        
        }      
      
        public double consultarsaldo1 (){
        
            return (saldo1);
        
        }
    
        
    }




