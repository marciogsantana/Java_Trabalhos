
import java.util.Scanner;

  public class Questaoswitch {

      public static void main(String[] args) {
        int opcao;   
          System.out.println("\t\t informe o mes ");    
          System.out.println("\t01. - janeiro");
          System.out.println("\t02. - fevereiro");
          System.out.println("\t03. - março");        
          System.out.println("\t04. - abril");
          System.out.println("\t05. - maio");
          System.out.println("\t06. - junho");
          System.out.println("\t07. - julho");
          System.out.println("\t08. - agosto");
          System.out.println("\t09. - setembro");
                 
           Scanner entrada = new Scanner(System.in);
           opcao = entrada.nextInt();
    
           switch( opcao )
           {        
             case '1': 
                 System.out.println(" o numero de dias é 1");
                 break;       
                        
            case '2': 
                  System.out.println(" o numero de dias é 2");
                  break;      
            case '3':
                  System.out.println(" o numero de dias é 3");
                  break;     
            case '4':
                  System.out.println(" o numero de dias é 4");
                  break;      
            case '5':
                  System.out.println(" o numero de dias é 5 ");
                  break;     
            case '6':
                  System.out.println(" o numero de dias é 6");
                  break;     
            case '7':
                  System.out.println(" o numero de dias é 7");
                  break;     
            case '8':
                  System.out.println(" o numero de dias é 8");
                  break;     
            case '9':
                  System.out.println(" o numero de dias é 9");
                  break;
            default:
                  System.out.println("voce não informou uma opcao valida");
           }    
    
        System.out.println(" opcao selecionada "  +  opcao);
    
      }
  }