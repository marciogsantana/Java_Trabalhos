
package projeto_arvore_binaria;


public class Projeto_arvore_binaria {

  
    public static void main(String[] args) {
     
        Arvore a = new Arvore();
        
        a.Inserir("marcio", "1245455");
        a.Inserir("fabricio", "121214");
        a.Inserir("antonio", "3564121");
        a.Inserir("jose", "9999999");
        a.caminharempreordem();
        a.caminharemordem();
        a.caminharposordem();
        
    }
    
}
