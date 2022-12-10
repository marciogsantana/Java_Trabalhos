
public class Principal {

     public static void main(String args[]){
	    Lista lista = new Lista();

	    lista.inserir_inicio(45);

	    lista.inserir_inicio(60);
	    lista.inserir_inicio(1);
//	    lista.inserir_pos(30, 2);
//	    lista.inserir_pos(40,2);
	    lista.inserir_inicio(35);
	    lista.imprimir();
	    lista.remover(35);
//	    boolean b=lista.vazia();
//	    System.out.println(b);
//	    lista.contar_nodos();
	    lista.imprimir();


	}
}