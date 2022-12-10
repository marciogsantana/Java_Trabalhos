
public class Listamarciohomogenia {

    
    public static void main(String[] args) {

        int pes,it;
        boolean e;
        
        Classelistahomogeniamarcio lista = new Classelistahomogeniamarcio();
        
              lista.inserir(15);
              lista.inserir(30);
              lista.inserir(40);
              lista.inserir(50);
              lista.inserir(1, 44);
              lista.imprimir();
              pes = lista.localizaritem(30);
              it = lista.localizarposicao(30);
              System.out.println("o valor encontrado é " + pes);
              System.out.println("a posicao encontrada é  " + it);
              e = lista.excluir(30);
              System.out.println("valor boolean" + e);
              System.out.println("apos exclusao");
              
              lista.imprimir();
        
        
        
    }
    
}
