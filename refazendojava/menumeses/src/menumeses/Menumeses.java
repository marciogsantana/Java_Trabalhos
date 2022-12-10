
package menumeses;

import java.util.Scanner;

public class Menumeses {

    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o mes");
        
        String mes = entrada.next();
        
        
        switch (mes){
            
            case "janeiro":
                
                System.out.println(" o mes é janeico com");
            
                break;
            
            case "fevereiro":
            
               System.out.println(" o mes é fevereiro");
                
                break;
                
            case "marco":
            
               System.out.println(" o mes é marco");     
                
               break;
                
            case "abril":
            
               System.out.println(" o mes é abril");
                 
                break;
                 
            case "maio":
            
               System.out.println(" o mes é maio");     
                 
                break;
                
            case "junho":
            
               System.out.println(" o mes é junho");     
                
                break;
                
            case "julho":
            
               System.out.println(" o mes é julho");     
                 
                break;
                
            case "agosto":
            
               System.out.println(" o mes é agosto");     
                 
                break;
                
            case "setembro":
            
               System.out.println(" o mes é setembro");     
                 
                break;
                
            case "outubro":
            
               System.out.println(" o mes é outubro");     
                 
                break;
                
            case "novembro":
            
               System.out.println(" o mes é novembro");
                
                break;
                
                
            case "dezembro":
            
               System.out.println(" o mes é dezembro");   
                
                
                break;
                
            default:
                
                System.out.println(" informe uma opçao valida");
                
        }
    }
    
}
