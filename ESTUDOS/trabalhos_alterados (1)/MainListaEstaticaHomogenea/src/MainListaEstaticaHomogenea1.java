import java.util.Scanner;

public class MainListaEstaticaHomogenea1 {

    
    public static void main(String[] args) {
  
        int x,l,e;
        
        Scanner entrada = new Scanner(System.in);
        
        ListaEstaticaHomogenea lista = new ListaEstaticaHomogenea();
		
		lista.inserir(5);
		lista.inserir(7);
		lista.inserir(9);
		lista.inserir(11);
		lista.inserir(13);
		lista.inserir(15);
                lista.inserir(33);
                lista.imprimir();
	        x = lista.tamanholista();
                System.out.println("informe o valor para pesquisar"); 
                l = lista.localizar(entrada.nextInt());
                System.out.println("informe o item para excluir");
                lista.excluiritem(entrada.nextInt());
                lista.inserir(33);
                
                
                System.out.println("o tamanho da lista  é " + x );      
                System.out.println("o retorno do localizar é " + l );
                lista.imprimir();
                
                
                
                
                
	}
}

        
        
        
        
        
        
        
        
        
        
        
        
    
    

