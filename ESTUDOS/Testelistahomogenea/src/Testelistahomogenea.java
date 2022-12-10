import java.util.Scanner;

public class Testelistahomogenea {

    public static void main(String[] args) {

        Testec lista = new Testec();
        
        int x,y,z; 
        
        Scanner entrada = new Scanner(System.in);
        
        lista.inserir(12);
        lista.inserir(30);
        lista.inserir(44);
        lista.inserir(50);
        lista.inserir(65);
        lista.inserir(70);
        lista.imprimir();
        
        x = lista.tamanholista();
        
        System.out.println("o tamanho da lista é" + x);
        
        System.out.println("informe o valor para pesquisar o modulo");
        
        y = lista.localizar(entrada.nextInt());
        
        System.out.println("informe a valor para pesquisar a posição");
        
        z = lista.localizarposicao(entrada.nextInt());
        
        
        System.out.println(" o valor do nodulo é " + y);
        System.out.println(" a posição do nodulo  é " + z);
        
        
        
        
        
    }
    
}
