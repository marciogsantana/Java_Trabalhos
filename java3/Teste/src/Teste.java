public class Teste {
        
        private int conta, agencia;

        private double saldo;

        public void iniciarconta (int n, int ag){

          conta = n;
          agencia = ag;
          saldo = 0;      

        }

        public void sacar (double valor){ 
    
         saldo = saldo - valor;
       
        }   
   
        public void depositar (double deposito){
    
         saldo = saldo + deposito;
    
        }
    
        public double consultarsaldo(){
    
          return (saldo);
    
        }
    
    }
