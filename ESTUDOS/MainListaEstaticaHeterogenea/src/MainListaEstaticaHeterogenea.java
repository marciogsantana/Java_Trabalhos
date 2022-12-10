public class MainListaEstaticaHeterogenea{
	public static void main(String args[]){
		ListaEstaticaHeterogenea lista = new ListaEstaticaHeterogenea();
		Ficha item1 = new Ficha();
		
		item1.setNome(" Elson");
		item1.setSalario(20000);
		lista.inserir(item1);

		
		item1.setNome(" Gabriel");
		item1.setSalario(13000);
		lista.inserir(item1);
		
		
		
		item1.setNome("Elcio");
		item1.setSalario(45000);
		lista.inserir(item1);
		
		item1.setNome("Rose");
		item1.setSalario(25000);
		lista.inserirInicio(item1);
		
		

		lista.inserir("galo", 2500);
		lista.imprimir();
		
		
		
		

	}
}
