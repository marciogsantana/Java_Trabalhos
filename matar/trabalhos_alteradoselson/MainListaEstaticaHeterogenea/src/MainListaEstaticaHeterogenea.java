
public class MainListaEstaticaHeterogenea {


	public static void main(String args[]){ 
		
		Ficha item1 = new Ficha();
                ListaEstaticaHeterogenea lista = new ListaEstaticaHeterogenea();
		item1.setNome("Elson");
		item1.setSalario(20000);
		lista.inserir(item1);

		item1.setNome("Maria");
		item1.setSalario(7000);
		lista.inserir(item1);		

		lista.imprimir();
	}
}