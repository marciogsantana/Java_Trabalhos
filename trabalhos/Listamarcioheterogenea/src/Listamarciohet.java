
public class Listamarciohet {

    private static final int TMAX = 5;
    
    private Fichamarcio []  nodos;
    
    private int tamanho;
    
    
    public Listamarciohet(){
    
       this.nodos = new Fichamarcio [TMAX];
       
       this.tamanho = 0;
       
    }
    
    public boolean listavazia(){
        
        return(this.tamanho == 0);
        
    }
    
    public void inserir(Fichamarcio item){
        
        if (this.tamanho <= (TMAX-1)){
            
            this.nodos[this.tamanho] = new Fichamarcio(item.getnome(),item.getsalario());
            
            this.tamanho++;
            
        }    
    }
        
    public void inserir(String n, float s){
        
        if (this.tamanho <= (TMAX-1)){
    
             this.nodos[this.tamanho] = new Fichamarcio (n , s);
             
            this.tamanho++;
            
        }    
    
    }
    
    public void imprimir(){
      if(this.tamanho > 0){
	    for(int i=0;i<this.tamanho;i++){
        System.out.println("Nome:"    + this.nodos[i].getnome());
    	System.out.println("Salario:" + this.nodos[i].getsalario());
          System.out.println("========");
        }
      }else{
        System.out.println("Lista Vazia");	
      }
    }

    
    public int talanholista(){
        
        return(this.tamanho);
    
    }
    
    public boolean listacheia(){
        
        boolean f;
        
        f = false;
        
        if (this.tamanho == 5){
        
            f = true;
            
            return(f);
        }    
            
            return(f);
    
    }
       public void inserirInicio(Fichamarcio item) {
	  if (tamanho == TMAX) {
		  System.out.println("Lista Cheia");
	  }
	  else if (tamanho == 0) {
	      	this.nodos[0] = new Fichamarcio(item.getnome(), item.getsalario());
	        this.tamanho++; 
	  }
	  else {
		  this.tamanho ++;
		  for (int x=tamanho-1; x>0; x--) {
			  nodos [x] = nodos [x-1];
		  }
		  this.nodos[0]=item;
	  }
	  
  }
            
       public void removerTodos() {
	  for (int i=0; i<this.tamanho; i++){
		  this.nodos[i] = null;
	  }
	  this.tamanho=0;
  }
}
      
            
            
            
            
            
            

    
    
    
    
    
    
    
    
    
    

