
public class Conta {

    private int numero, conta;
    
    private int saldo, saldo1;
    
    public void iniciarconta (int n, int ag ){
    
         numero = n;
         conta = ag;
         saldo = 0;
         saldo1= 0;
    }     
        
    public void deposito (int deposito){
    
        if (deposito > 0){
        
           saldo = saldo + deposito;
        }  
    } 
    
    public int consultarsaldo(){
        
        return(saldo);
    }
    
     
    public void sacar (int sacar){
        
        
        
        if (sacar <= saldo){
               
            saldo = saldo - sacar;
      
        }
        
        else{
    
            saldo1 = saldo;
            
        }
    }    
    
    public int consultarsaldo1(){
        
                
        return(saldo1);
    }
    
    public int exibir(){

       return(numero);
      
    }    
    

    public int exibirconta(){

       return(conta);
       
    }   
       
    public int retornosaque(){   
       
       return(saldo);
        
    }
}    
    
    
    
    
    
    
    
    
