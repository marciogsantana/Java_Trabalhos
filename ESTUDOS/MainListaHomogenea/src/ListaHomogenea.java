public class ListaHomogenea {
	private static final int TMAX = 5;  
	private int [] nodos;				
	private int tamanho;				
	
	public ListaHomogenea(){	//metodo construtor
	  this.nodos = new int [TMAX];
	  this.tamanho = 0;
	}
	public boolean listaVazia(){	
      boolean a;
      a = false;
      if (this.tamanho==0){
    	  a = true;
      }
      
      return (a);
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
	public void tamanhoLista(){
		System.out.println(this.tamanho);
	}
	public int localizar (int item){
		for (int i=0; i<this.tamanho; i++){
			if (item == nodos[i]){
				return(i);
			} 
		}
		return (-1);
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
	public boolean excluirItem(int item) {
		int p;
		boolean f;
		f= false;
		p = localizar(item);
		if (p>0){
			for (int x=p; x<tamanho; x++){
				nodos[x]= nodos [x+1];
			}
			tamanho--;
			f = true;
		} return (f);
	}


	

}



