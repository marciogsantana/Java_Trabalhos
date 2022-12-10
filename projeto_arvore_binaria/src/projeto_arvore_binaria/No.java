
package projeto_arvore_binaria;

public class No {
    
    private Contato contato;
    
    private No dir,esq;
    
    
    
public No(String nome, String telefone){
    
      contato = new Contato(nome,telefone);
    
      esq = null;
      dir = null;
      
}    

    /**
     * @return the contato
     */
    public Contato getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    /**
     * @return the dir
     */
    public No getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(No dir) {
        this.dir = dir;
    }

    /**
     * @return the esq
     */
    public No getEsq() {
        return esq;
    }

    /**
     * @param esq the esq to set
     */
    public void setEsq(No esq) {
        this.esq = esq;
    }
    
    public String tostring(){
        
        return(contato.tostring());
        
    }
}
