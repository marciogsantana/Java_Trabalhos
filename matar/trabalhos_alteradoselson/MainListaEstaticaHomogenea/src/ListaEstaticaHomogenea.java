
public class ListaEstaticaHomogenea {
 
    private static final int TMAX = 5; 
	private final int [] nodos;
	private int tamanho;
	
	public ListaEstaticaHomogenea(){
	  this.nodos = new int [TMAX];
	  this.tamanho = 0;
	}
	public boolean listaVazia(){
      return (this.tamanho==0);
	}
	public void inserir(int item){
	  if(this.tamanho <= (TMAX-1)){
        this.nodos[this.tamanho] = item;
        this.tamanho++;        	
	  }
	}
	public void imprimir(){
	  for(int i=0;i<this.tamanho;i++){
        System.out.println(nodos[i]);
      }
	}

        public int tamanholista(){
     
         return(tamanho);

        }  

        public int localizar (int loc){
 
             for(int i=0;i<this.tamanho;i++){
                 
                 if ( nodos[i] == loc){

                     return(i); 
                 
                 } 
             } 
                    return(-1);
             
                  
        }
                
       public boolean excluirItem(int item) {
		int p;
		
                boolean f;
		
                f = false;
		
                p = localizar(item);
		
                if (p >= 0){
                    
		  for (int x=p; x<(this.tamanho-1); x++){
		    this.nodos[x]= this.nodos [x+1];
		  }
                  
		  this.tamanho--;
                  
		  f = true;
		} 
                
                return (f);
	}

           

        public void inserir (int pos, int item){
		if (this.tamanho == TMAX){
			System.out.println("A lista está cheia! ");
		} else if (this.tamanho == 0){
			this.nodos[this.tamanho] = item;
			this.tamanho ++;
		} else {
			   this.tamanho++;
				for (int x=tamanho-1; x>pos; x--) {
				 nodos[x] = nodos [x-1];
				   }
				this.nodos[pos]=item;
				}
	}














}
       
        
        


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

