
package aplicacao_fraturacar;


public class lancamentos {

    private int orcamento;  // valor disponivel do orcamento para pagamento do cartao
    
    private int saldo_atual; // saldo disponivel ( orcamento - valor despesas)
    
    private int total_despesas; // total dos lancamentos 
    
    private int lancamento; // lancamento cada compra
    
    private int saldo_atual_terceiros; // total saldo compras terceiro
    
    private int lancamento_terceiros; //  lancamento terceiros
    
    private int limite_cartao; // limite compra total do cartao
    
    public void setlancamento_orcamento(int valor){
        
        if (valor > 0){
            
            this.orcamento = valor;
        }
        
    }
        
    public int getlancamento_orcamento(){
        
        return(this.orcamento);
        
        
    }    
    
    
   public void setlancamentoparcela(int valor){
       
         this.lancamento = valor;
         
         this.total_despesas = (this.lancamento + this.total_despesas);
       
   }         
         
         
    public int getretorno_saldo_atual(){
        
        
        return(this.orcamento - this.total_despesas);
       
       
    } 
    
    public void setlancamento_terceiro(int valor){
        
        this.lancamento_terceiros = valor;
        
        this.saldo_atual_terceiros = this.saldo_atual_terceiros + this.lancamento_terceiros;
        
    }
    
    public int getlancamento_terceiro(){
        
        return(this.saldo_atual_terceiros);
    }
    
    public int getconsulta_limite(){
        
       return(this.limite_cartao - (this.saldo_atual + this.saldo_atual_terceiros));
        
    }
    
    public void setlancamento_limite_cartao(int valor) {
        
        this.limite_cartao = valor;
        
    }
    
}
