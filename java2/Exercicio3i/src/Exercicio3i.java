import java.util.Scanner;

  public class Exercicio3i {

    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
     
        int cont,total;
     
        total = 1;   
     
        System.out.println("infome o numero para fatorial");
     
        cont = entrada.nextInt();
     
                for (cont = cont; cont > 0; cont--){ 
            
                  total = total * cont;
                }
    
       System.out.println("o fatorial é " + total);
    
    }
  }