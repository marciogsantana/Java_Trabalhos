
package projeto_arvore_binaria;


public class Contato {
   
    private String nome, telefone;
    
    
    public Contato(String nome, String telefone){
        
           this.nome = nome;
           this.telefone = telefone;
           
                 
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    public String tostring(){
        
        return(nome + " " + telefone);
        
    }
    
    
}
