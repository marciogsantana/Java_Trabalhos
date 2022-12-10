
package menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
    
        
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        System.out.println(" selecione as opções");
        System.out.println("1 - opcao 1");
        System.out.println("2 - opcao 2");
        System.out.println("3 - opcao 3");
        System.out.println("4 - opcao 4");
        System.out.println("5 - opcao 5");
        
        opcao = entrada.nextInt();
        
        switch (opcao)
        
        {
            
            case 1:
                
                System.out.println(" opcao selecionada numero 1");
                break;
        
            case 2:
                System.out.println(" opcao selecionada numero 2");
                break;
                
            case 3:
                
                System.out.println(" opcao selecionada numero 3");
                break;
                
            case 4:
                System.out.println(" opcao selecionada numero 4");
                break;
            case 5:
                System.out.println(" opcao selecionada numero 5");
                break;
                
            default:
                
                System.out.println(" informe uma opção valida");
                
        }         
                
                
                
    }
    
}
