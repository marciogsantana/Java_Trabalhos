
package jogomarcio;
import java.util.ArrayList;
import java.util.Scanner;

 
public class Jogomarcio {

    
    public static void main(String[] args) {

    int valor;    
        
    int teste = 1;
    
    int numeroacertos = 0;
    
    int numerorandomico = (int) (Math.random() * 9);
         
        
    int numerofinal = numerorandomico; 
        
   
        
        ArrayList<Integer> ma = new ArrayList<Integer>();
        
        ma.add(numerofinal);
        ma.add(numerofinal + 1);
        ma.add(numerofinal + 2);
        
        System.out.println(ma);
        
        System.out.println("informe o palpite");
        
  while(teste!=0){
        
        Scanner entrada = new Scanner(System.in);
        
        int palpite;
        
        palpite = entrada.nextInt();
        
        numeroacertos++;
        
        
        
        for (int verifica : ma){
            
            valor = verifica;
            
            if (valor == palpite){
                
                                
             ma.remove(0);   
                
                
                
                System.out.println("parabens voce acertou uma posição");
            
            }
            
            else {
                
                System.out.println(" errado nao desanime tente novamente");
            }
            
            break;
        }
        
             boolean pa = true;
        
              
         
             if (ma.size() == 0){
                 
                 teste = 0;
              
                 pa = false;
                 
                 
                 
             }
        
           if (pa == false){  
             
               System.out.println(" fim de jogo");
               
               System.out.printf(" voce usou %d tentativas\n", numeroacertos);
            } 
  }
           
  }   
}   
    
        
        
       
            
