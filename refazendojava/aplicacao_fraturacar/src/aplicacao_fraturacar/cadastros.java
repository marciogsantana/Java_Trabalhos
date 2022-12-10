
package aplicacao_fraturacar;

public class cadastros {

    
    private String nome;
    
    private int data_fechamento;
    
    
      public void setcadastrar(String nome, int data){

               this.nome = nome;
                
                if (data > 0 && data <=31){
                    
                    this.data_fechamento = data;
               }

        }


        public String getretornonome(){
    
              return(this.nome);
    
          }   
         
        
        public int getretornodata_fechamento(){
            
            return(this.data_fechamento);
            
        }
        
        
        
        
        
        
 }