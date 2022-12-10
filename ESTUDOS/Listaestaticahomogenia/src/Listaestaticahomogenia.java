import java.util.Scanner;

public class Listaestaticahomogenia {


    public static void main(String[] args) {

        int tamanho,loc,locn;
        
        
        Listah lista1 = new Listah();
        
        lista1.listavazia();
        lista1.imprimir();
        lista1.inserir(8);
        lista1.inserir(14);
        lista1.inserir(19);
        lista1.inserir(25);
        lista1.inserir(41);
        lista1.inserir(100);
        
        lista1.imprimir();
        
        tamanho = lista1.tamanholista();
        
        System.out.println(" o tamanho da lista é " + tamanho);
          
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o valor para pesquisa");
        
        
        loc = lista1.localizar(entrada.nextInt());
        
        locn = lista1.localizarnodos(entrada.nextInt());
        
        System.out.println("a posição na lista é " + loc);
        System.out.println("o valor pesquisado na lista é " + locn);
    }
    
}
