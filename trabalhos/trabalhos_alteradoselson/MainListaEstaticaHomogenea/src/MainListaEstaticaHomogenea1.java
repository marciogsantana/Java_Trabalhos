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
		
                System.out.println("LISTA EM ESTADO INICIAL ****** "); 
                lista.imprimir();
                
                System.out.println("MODIFICANDO LISTA ****** "); 
                
	        x = lista.tamanholista();
                System.out.println("informe o valor para pesquisar"); 
                
                l = lista.localizar(entrada.nextInt());
                System.out.println("esta na posicao " + l); 
                
                System.out.println("informe o item para excluir");
               
                lista.excluirItem(entrada.nextInt());
                
                System.out.println("LISTA MODIFICADA ****** "); 
                
                System.out.println("o tamanho da lista  é " + x );      
                System.out.println("o retorno do localizar é " + l );
                 lista.imprimir();
                
                
                lista.imprimir();
                //lista.inserir(0, 44);
                lista.imprimir();
                System.out.println("teste");
                lista.imprimir(); 	
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
