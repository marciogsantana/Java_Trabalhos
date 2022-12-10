
package projeto_arvore_binaria;


public class Arvore {
    
    
    private No raiz;
 
    
    private void preordem(No no){
        
        if (no!= null){
            
            System.out.println(no.tostring());
            preordem(no.getEsq());
            preordem(no.getDir());
            
        }
        
    }   
     
     public void caminharempreordem(){
         
         preordem(raiz);
         
     }     
    
     private void posordem(No no){
        
        if (no!= null){
            
            posordem(no.getEsq());
            posordem(no.getDir());     
            System.out.println(no.tostring());
            
        }
        
    }   
     
     public void caminharposordem(){
         
         posordem(raiz);
         
     }     
     
     private void emordem(No no){
        
        if (no!= null){
            
            emordem(no.getDir());
            System.out.println(no.tostring());
            emordem(no.getEsq());
        }
        
    }   
     
     public void caminharemordem(){
         
         emordem(raiz);
         
     }     
    
    public void Inserir(String nome, String telefone) {
        
       No no = new No(nome, telefone);

        if (raiz == null)
        {
           raiz = no;
        }
        else //se não...
        {
           //ponteiros para busca
           No aux, ant; 

           aux = raiz; //ponteiro inicia na raiz
           ant = null; //anterior inicial em NULL
           int comp;

           while (aux != null) { //Faz a busca do lugar ao qual deve ser inserido o nó
                ant = aux;

                comp = nome.compareToIgnoreCase(aux.getContato().getNome());

                if (comp == 0) {
                     System.out.println("\nDado inserido já existe!");
                     return;
                }

                if (comp > 0){
                     aux = aux.getDir();
                }
                else {
                     aux = aux.getEsq();
                }
            }

        if  (nome.compareToIgnoreCase(ant.getContato().getNome()) > 0)
            ant.setDir(no);
        else  
            ant.setEsq(no);
     }

}
    
}

    
    
    
    
  
