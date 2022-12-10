import java.util.Scanner;
public class Vetorsala {

   public static int pesquisar (int vetor[],int p){
    
    int i,pos;
    
    pos = -1;
    
    for (i=0; i<5; i++){
      
       if (vetor[i] == p){
        
        pos = i;
        break;
       }
    } 
       
       return (pos);
   }   
public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);
    
    int vetor[] = new int[5];
    
    int i,p,achou;
    
    for (i=0; i<5; i++){
      System.out.println("digites os numeros");
      vetor[i] = entrada.nextInt();
    }  
      System.out.println("digite um valor para pesquisa");
      p = entrada.nextInt();
      achou = pesquisar(vetor,p);
      // o valor do retorno sera atribuido a achou
      
      if (achou ==-1){
          System.out.println("não foi lacalizado nenhum valor");
      }
      else {
          System.out.println("o valor se encontra na posição" + achou);
          
      }
    
    
}
}