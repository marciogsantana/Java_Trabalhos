
package estearrayaplijavaprogressivolist;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Arrays;


public class Estearrayaplijavaprogressivolist {

    
    
    public static void main(String[] args) {
      
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("marcio");
        lista.add("tata");
        System.out.println(lista.get(0));
        lista.add("danilo");
        System.out.println(lista.size());
        lista.add(0, "amigo");
        System.out.println(lista);
        lista.remove("danilo");
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista.get(0));
        System.out.println(lista);
        int numero = lista.size();
        System.out.println(numero);
        
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        
        System.out.println("informe o numero");
        
        Scanner entrada = new Scanner(System.in);
        
        lista1.add(entrada.nextInt());
        lista1.add(entrada.nextInt());
        int ultimo = lista1.size();
        int u = ultimo;
        
         System.out.println(ultimo);
         System.out.println("exibindo ultimo da pilha");
         System.out.println(lista1.get(u -1));     
         System.out.println("removendo ultimo elemento da pilha");
         lista1.remove(u-1);
         System.out.println(lista1);
         lista1.add(entrada.nextInt());
         lista1.add(entrada.nextInt() );
         System.out.println(lista1);
         int ultim = lista1.size();
         int u1 = ultim;
         System.out.println("exibindo ultimo da pilha");
         System.out.println(lista1.get(u1 -1));     
         System.out.println("removendo ultimo elemento da pilha");
         lista1.remove(u1-1);
         System.out.println(lista1);
         
         
         
         
    }
    
}
