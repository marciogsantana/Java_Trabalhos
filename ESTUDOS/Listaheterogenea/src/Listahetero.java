
public class Listahetero {

    private static final int TMAX = 5;
    
      private final Ficha[] nodos;
      
      private int tamanho;
      
      public Listahetero(){
          
          this.nodos = new Ficha [TMAX];
          
          this.tamanho = 0;
          
      }    
          
      public boolean listavazia(){
          
          return(this.tamanho ==0 );
          
     
      }
    
      public void inserir(Ficha item){
          
          if (this.tamanho <= (TMAX-1)){
              
              this.nodos[this.tamanho] = new Ficha(item.getnome(),item.getsalario());
              
              this.tamanho++;
              
          }     
              
              
       }
          
       
      public void inserir(String n, float s){
          
          if (this.tamanho <= (TMAX -1)){
          
             this.nodos[this.tamanho] = new Ficha(n ,s );
             
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

}

      
      
      
      
      
          
          
    
    
    
    
    
    
    
    
    
    
    

