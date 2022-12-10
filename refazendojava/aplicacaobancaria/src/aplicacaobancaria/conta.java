
package aplicacaobancaria;

public class conta {

    private String nome;
    
    private int numero;
    
    private int valorinicial;
    
    private int numerosaques;
    
    public conta(){
    
    nome = "padrao";
    
    numero = 0001;
    
    valorinicial = 0;
    
    numerosaques = 0;
    
}
    
    
    public void setiniciarconta(String nome, int numero, int valorinicial){
        
        this.nome = nome;
        
        this.numero = numero;
        
        this.valorinicial = valorinicial;
        
    }    
        
    public void setdeposito(int valor){
        
        if (valor > 0){
            
            this.valorinicial = this.valorinicial + valor;
            
            System.out.println(" deposito efetuado com sucesso saldo atual  " + this.valorinicial);
            
            
        } else {
            
            
            System.out.println(" informe um valor valido") ;
            
        }   
            
        
    }    
        
    public void setsacar(int valorsa){    
        
                   
            if (valorsa <= this.valorinicial && this.numerosaques < 5){
                
                this.valorinicial = (this.valorinicial - valorsa);
                
                System.out.println(" daque efetuado com sucesso saldo atual  " + this.valorinicial);
               
                
                numerosaques++;
                
            }
            
             else  {
            
             System.out.println(" saldo nao disponivel ou numero de saques superior a 5 no dia") ;
            
        }   
            
    }
        
        
         public void exibimenu(){
             
             System.out.println(" menu informe uma opção");
             
             System.out.println(" 1 " + " " + " deposito");
             
             System.out.println(" 2 " + " " + " sacar");
             
             System.out.println(" 3 " + " " + " extrato");
             
             System.out.println(" 4 " + " " + " sair");
             
         }     
             
             
        public void extrato(){
            
            System.out.println(" nome é" + this.nome);
            
            
            System.out.println(" numro conta" + this.numero);
            
            
            System.out.println(" o valor do saldo é" + this.valorinicial);
            
            System.out.println(" numeque saques no dia foi \t "+ numerosaques);
            
        }
    
    
     
    
    
}
