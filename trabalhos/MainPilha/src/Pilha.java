
public class Pilha {

    private Nodo topo;
	int tamanho;
	public Pilha(){
		this.topo = null;
		this.tamanho = 0;
	}
	public boolean estaVazia(){
		return(this.topo==null);
	}
	public Nodo topo(){
		if (this.estaVazia() == false){
			return this.topo;
		}
		return null;
	}
	
	public void empilhar(int i){
  		Nodo novo = new Nodo();
  		novo.setInfo(i);
  		novo.setProx(this.topo);
  		this.topo = novo;
		this.tamanho++;
}
public Nodo desempilhar(){
      	Nodo n = this.topo;
      	this.topo = this.topo.getProx( );  // desliga o no do topo
      	this.tamanho--; 
      	return n;
      	
  }
  public void imprimir(){
	  System.out.println("==============");
     	System.out.println ("IMPRESSAO DA PILHA");
  	     	for(Nodo n = this.topo; n != null; n=n.getProx()){
			 System.out.println(n.getInfo());
    	}
  }
  public Pilha inverter(){
	  Pilha m = new Pilha();
	  while (this.topo != null){
		  Nodo n = this.desempilhar();
		  m.empilhar (n.getInfo());
		  n = n.getProx();
	  }  return m;
 
	  
  }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

