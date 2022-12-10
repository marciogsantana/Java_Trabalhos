
public class Lista {

    private Nodo prim;
	private Nodo Ultimo;  
	 int qnt=0;
	   public Lista() {
	      this.prim = null;
	      this.Ultimo = prim;
	      
	   }
	   public void inserir_inicio(int i) {
	      Nodo novo = new Nodo();
	      novo.setInfo(i);
	      novo.setProx(prim);
	      this.prim = novo;
	      
	   }
	   public void imprimir() {
	      System.out.println("Imprimindo valores: ");
		   for(Nodo n = this.prim; n != null; n = n.getProx()){
	         System.out.println (n.getInfo());
	         
	       }
	      
	      System.out.println("====================");
	   }
	    
	   public int contar_nodos (){
		   if (this.prim == null){
			   return 0;
		   }
		   else {
				  
				   for (Nodo n = this.prim; n !=null; n = n.getProx()){
					   qnt ++;   
			        }
			   return (qnt);
		   }
	   }
	   public boolean vazia (){
		   boolean b = false;
		   if (this.prim == null){
			   b = true;
			   return (b);
		   } return (b);
		   
	   }
	   public Nodo localizar (int i){
		   for (Nodo n = this.prim; n != null; n = n.getProx()){
			   if (i == n.getInfo()){
				   	return (n);
			   }
		   }
			   return null;
	  }

	public void inserir_pos (int i, int pos) {
		   if (this.prim == null) {
			      this.prim = new Nodo();
			      Ultimo = prim;
			      Nodo novo = new Nodo ();
			      novo.setInfo(i);
			      novo.setProx(null);
			      Ultimo.setProx(novo);
			      Ultimo = novo;
			      
		   } else {
			   
			   if (this.contar_nodos() > pos){
			  
			     Nodo novo = new Nodo ();
			     novo.setInfo(i);
			     novo.setProx(null);
			     
			     Nodo n = this.prim;
			     if ( pos > 0) { 
			    	 for(int x = 1; x < pos-1; x++){
			    		 n = n.getProx();   
			    	 }
			    	 novo.setProx(n.getProx());
			    	 n.setProx(novo);
			     }
			     else {
			    	 novo.setProx(prim.getProx());
			    	 prim = novo;
			     }
			 
			   }
			   
		   }   
	   }
	
	public void remover (int i) {
//		Nodo anterior = null;
		Nodo p = this.prim;
		Nodo x = p;
		if (contar_nodos()==0){
			System.out.println("A lista está vazia");
		} else if (this.prim.getInfo() == i){
			this.prim = this.prim.getProx();
		}
		else {
			
			for (p = this.prim; p.getProx() != null; p = p.getProx()){
				x = p.getProx();
				if (x.getInfo() == i) {
				p.setProx(x.getProx());
				x.setProx(null);
				qnt --;
				break;
				}

			}
			 
			 
			/*while (p != null && p.getInfo()!= i) {
				anterior = p;
				p = p.getProx();
			}
			if (p == null){
				System.out.println("Não fora encontrado o valor solicitado.");
				return;
			}
			if (anterior == null){
				this.prim = p.getProx();
			} else {
				anterior.setProx(p.getProx());
			}
					*/
					
			
		}
	}
	
}
	   
	   

    
    
    
    

