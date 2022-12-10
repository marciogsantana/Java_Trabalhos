
public class MainAviao {

   public static void main (String[] args){

	Fila novo = new Fila ();
	Aviao v;
	novo.inserir	(5, 20);
	novo.inserir 	(3, 30);
	novo.inserir	(4, 40);
	novo.imprimirespera();
	novo.remover();
	novo.imprimirespera();
	novo.FilaDeEspera ();
	novo.CaracProx();
	}
	
}

