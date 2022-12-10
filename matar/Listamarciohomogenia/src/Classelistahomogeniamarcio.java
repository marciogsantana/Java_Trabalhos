
public class Classelistahomogeniamarcio {

    private static final int TMAX = 5;
    
    private final int [] nodos;
    
    private int tamanho;
    
    
    public Classelistahomogeniamarcio () {
    
           this.nodos = new int [TMAX];
           
           this.tamanho = 0;
           
    }       
           
     public boolean listavazia() {
    
       return(this.tamanho == 0);
       
     }        
    
    
     public void inserir(int item){
    
          if (this.tamanho <= TMAX-1){
    
            this.nodos[this.tamanho] = item;
             
            this.tamanho++; 
            
         }       
                       
    }
    
    public void imprimir() {
        
        for (int i = 0; i <=(TMAX -1); i++){
            
            System.out.println(nodos[i]);
            
        }
    }
    
    public int tamanholista(){
        
        return(this.tamanho);
        
    }
    
    public int localizaritem(int item){
    
            for (int i = 0; i <=(TMAX-1); i++){
    
                 if (nodos[i] == item){ 
    
                     return(item);
    
                 } 
            }
    
                return(-1);
    }
    
    public int localizarposicao(int item){
    
            for (int i = 0; i <=(TMAX-1); i++){
    
              if (nodos[i] == item){ 
                  
                  return(i);
                  
              }   
    
            }
    
                 return(-2);
    }              
    
    
     public void inserir(int pos, int item){
         
            if (this.tamanho == 5){
                
                System.out.println(" lista cheia ");
                
            }
          
            else {         
         
                
		
                  for (int x=tamanho; x>pos; x--) {
		
                      nodos[x] = nodos [x-1];
		
                  }
                  
		      this.nodos[pos]=item;
				
            }      
                
     }
    
    
     
     public boolean excluir(int item){
         
         int p;
         
         boolean  f;
         
         f = false;
         
         p = localizarposicao(item);
         
         if (p >= 0){
             
             for (int x = p; x<(this.tamanho-1); x++){
                 
                    this.nodos[x] = this.nodos[x+1];
                    
            }        
              
            this.tamanho--;
            
            f = true;
            
                        
         }  
           
           
         
          return(f);   
             
            
     }
             
             
}

     
     
    

