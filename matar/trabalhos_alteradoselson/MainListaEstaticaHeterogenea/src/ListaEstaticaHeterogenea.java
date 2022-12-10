public class ListaEstaticaHeterogenea {
    
private static final int TMAX = 5; 

  private Ficha[] nodos;
  private int tamanho;
	
  public ListaEstaticaHeterogenea(){
    this.nodos = new Ficha [TMAX];
    this.tamanho = 0;
  }

  public boolean listaVazia(){
    return(this.tamanho==0);
  }

  public void inserir(Ficha item){
    if(this.tamanho <= (TMAX-1)){
      this.nodos[this.tamanho]=new Ficha(item.getNome(),item.getSalario());
      this.tamanho++;        	
    }
  }    
    
public void inserir(String n, float s){
        if(this.tamanho <= (TMAX-1)){
        	this.nodos[this.tamanho] = new Ficha(n, s);
          this.tamanho++;        	
        }
    }    
    
    public void imprimir(){
      if(this.tamanho > 0){
	    for(int i=0;i<this.tamanho;i++){
          System.out.println("Nome:"    + this.nodos[i].getNome());
    	System.out.println("Salario:" + this.nodos[i].getSalario());
          System.out.println("========");
        }
      }else{
        System.out.println("Lista Vazia");	
      }
    }

}



































