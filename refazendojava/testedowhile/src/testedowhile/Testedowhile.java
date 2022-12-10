
package testedowhile;


import java.util.Scanner;

public class Testedowhile {

    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        
        boolean continua = true;
        
        int opcao ;
        
        do{
        
            System.out.println("\t tmenu de opçoes do curso java progressio");
            System.out.println("\t1. ver menu");
            System.out.println("\t2. ler menu");
            System.out.println("\t3. repetir menu");
            System.out.println("\t4. tudo de novo");
            System.out.println("\t5. nao li pode repetir");
            System.out.println("\t0. sair");
            
            System.out.println("\n insira sua opcao");
            
            opcao = entrada.nextInt();
            
            if (opcao == 0){
    
                continua = false;
                
                System.out.printf("programa finalizado");
            
            }
            
            else {
            
                 System.out.println("\n\n\n\n\n\n");
                }
    
            } while (continua);
    }
}