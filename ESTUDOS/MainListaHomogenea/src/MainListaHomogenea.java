
public class MainListaHomogenea {
public static void main(String args[]){
		ListaHomogenea lista = new ListaHomogenea();
		lista.inserir(7);
		lista.inserir(41);
		lista.inserir(18);
		lista.inserir(25);
		lista.inserir(1, 4); 
		int a= lista.localizar(25);
		System.out.println("posição: " +a);
		lista.imprimir();
	}
}


