
public class Fila {

   Aviao cabeca, cauda;
	int tamanho;
	public Fila() {
		this.cabeca = null;
		this.cauda   = null;		
		this.tamanho = 0;
	}
	public boolean estaVazia(){
		return(this.cabeca==null && this.cauda==null);
	}
	public void imprimirespera(){ //Listar todos os aviões à espera de decolar.  
		System.out.println("=========");
            	for(Aviao n = this.cabeca; n != null; n=n.getProx()){
    			 System.out.println(n.getInfoNumeroAviao());
	    	}
	}        
	public void inserir(int i, int j) {
		Aviao novo = new Aviao();
		novo.setInfoNumeroAviao(i);
		novo.setInfoNumeroPasseiro(j);
	    novo.setProx(null); 
		if( this.estaVazia() ){
	        	         this.cabeca = novo; 
	    	} else {
    		         this.cauda.setProx(novo);
    		         System.out.println("Um novo avião entrou");
	    	}
		this.cauda = novo; 
	    	this.tamanho++;
	}
	
	public Aviao remover(){
		Aviao n;
		if ( this.estaVazia() ){
			System.out.println("Não há aviões na fila de espera.");
    		return null;
	    	} else {
	    			n = this.cabeca;
	    			System.out.println("O avião " + n.getInfoNumeroAviao() + " decolou.");
	    			this.cabeca = this.cabeca.getProx();
    		        this.tamanho--;
    		        
    	/*	         if (this.tamanho == 0){
    		//	this.cauda = null;
    		    //      }
		       */   return n;	
	    	 }
	}
	
		public void FilaDeEspera ()	{ //Nº de aviões à espera para decolar. 
		System.out.println("A lista de espera contem: " + this.tamanho + " avioes" );
	}
		public void CaracProx()	{
			Aviao n = this.cabeca;
			System.out.println("O proximo avião a decolar é: " + n.getInfoNumeroAviao() + " Com " + n.getInfoNumeroPassageiro() + " passageiros");
			
		}
		
			
}
	
	 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

