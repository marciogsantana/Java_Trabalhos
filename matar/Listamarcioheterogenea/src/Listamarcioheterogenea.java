
public class Listamarcioheterogenea {

    public static void main(String[] args) {

        Listamarciohet lista = new Listamarciohet();
        
        Fichamarcio ficha = new Fichamarcio();
        
        int x;
        
        boolean f;
        
        ficha.setnome("marcio");
        ficha.setsalario(6000);
        lista.inserir(ficha);
        
        ficha.setnome("andre");
        ficha.setsalario(5000);
        lista.inserir(ficha);
        
        
        lista.imprimir();
        
        f = lista.listacheia();
        
        System.out.println("a lista" + f);
        
        x = lista.talanholista();
        
        System.out.println("o tamanho da lista é " + x);
        
        
        lista.inserirInicio(ficha);
        ficha.setnome("paula");
        ficha.setsalario(5000);
        
        lista.imprimir();
        
        lista.removerTodos();
        
        lista.imprimir();
        
        lista.talanholista();
    }
    
}
