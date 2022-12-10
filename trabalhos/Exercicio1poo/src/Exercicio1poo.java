
import java.util.Scanner;


    public class Exercicio1poo {

        public static void main(String[] args) {
  
           Scanner entrada = new Scanner(System.in);
           
           
           Retangulo ret = new Retangulo(); 
   
   
           System.out.println("informe a altura do retangulo");
   
            do {
               
           
                  ret.setaltura(entrada.nextInt());
               
                 if (ret.altura() <= 1){
               
                    System.out.println("informe um valor maior que zero e um ");
                  
                 }   
        
            } while (ret.altura() <= 1);             
             
             
             System.out.println("informe a largura do retangulo");
             
             
             
                do {
               
           
                  ret.setlargura(entrada.nextInt());
               
                  if (ret.largura() <= 1){
                
                    System.out.println("informe um valor maior que zero  e um");
                  
                  }   
        
                } while (ret.largura() <= 1);             
             
             
                           
             System.out.println(" a largura é " + ret.largura());
             System.out.println(" a altura é " + ret.altura());
             System.out.println(" o perimetro " + ret.calcularperimetro()); 
             System.out.println(" a area é " + ret.calculararea());
        
        
        
        }
    
}
