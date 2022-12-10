
package exercicio21f;


import java.util.Scanner;

public class Exercicio21f {

   
    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
        
        
        int numero, trava;
        
        System.out.println(" informe o numero" );
        
        numero = entrada.nextInt();
        
        trava = numero;
        
        for(trava = numero; trava >0; trava--){
        
        System.out.printf(" os patinhos feios aparecem aqui %d\n" ,trava );
    }
    
}
}