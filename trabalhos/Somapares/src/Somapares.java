
public class Somapares {


    public static void main(String[] args) {

        int soma, controle,fato;
        
        soma = 0;
        
        controle = 12;
        
        while (controle >= 1){
        
              if (controle % 2 == 0){
              
               soma = soma + controle;
                  
              }
        
              controle--;
        
       }    
    
     
    
   System.out.println("a soma dos pares é " + soma);
    
    }
}