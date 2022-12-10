
public class Conta {

    private int numero,agencia,saque,deposito;
    
         public int saldo,saldo1;
    
         public void  dadosconta (int num){
    
            
             numero = num;
             
             saldo = 0;
        
         }     
    
         public void  dadosagencia (int age){
         
           agencia = age;
         
        
         }  
           
        public void  deposito(int valordeposito){
    
            if (valordeposito > 0){
            
               saldo = saldo + valordeposito;
               
               deposito = valordeposito;     
            }
    
        }
    
        public void sacar (int valorsacar){
    
           if (valorsacar < saldo){
    
              saldo = saldo - valorsacar;
    
              saque = valorsacar;
           }
           
           else {
               
               saldo1 = saldo;
               
           }
    
        }

        public int saldo () {
    
            return(saldo);
    
        } 
    
        public int saldo1 () {
    
            return(saldo1);
    
        } 
        
               
        public int agencia(){
    
         return(agencia);
        
        }
        
        public int conta(){
        
          return(numero);
        
        }
        
        
        public int sacar(){
        
          return(saque);
        
        }
        
        public int deposito(){
        
         return(deposito);
        
        }
        
        
}