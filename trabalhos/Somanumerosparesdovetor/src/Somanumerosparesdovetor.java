
public class Somanumerosparesdovetor {


    public static void main(String[] args) {

        int dados[] = new int[11];
        
        int soma = 0;
        
        for (int i = 0; i < dados.length; i++){
          
            dados[i] = i;
            
        }    
        
        for (int i = 0; i < dados.length; i++){
            
            if (dados[i] % 2 == 0 ){
            
               soma = soma + dados[i];
            
            }  
        
        
        
        }
    
      System.out.println("a soma dos pares é " + soma);
    }
}