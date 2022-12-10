
public class Exercicio5s {

    public static int sub (int vetor[]){
        
        int i, cont;
        
        cont = 0;
        
        for (i = 0; i <10; i++){
        
                           
              if (vetor[i] % 2 == 0){
              
                 cont = cont++; 
    
              }
         
        }      
    
       return(cont);
        
    }    
        
    public static void main(String[] args) {
     
        int p;
        
                
        int vetor[] = new int[10];         
                
        p = sub(vetor);
        
        
        System.out.println("os numeros pares é " + p);
        
    }
    
}
