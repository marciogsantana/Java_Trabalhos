import java.util.Scanner;

  public class Exercicio1i {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
         int numeros,menor,cont;
         
         System.out.println(" informe quantos numeros serao lancados ");
         
           numeros = entrada.nextInt();
         
           menor = numeros;
         
           cont = numeros;
         
         while (cont>0){
          
             numeros = entrada.nextInt();
           
             if (numeros < menor){
               menor = numeros;
             }    
           cont--;      
               
         }
    System.out.println(" o menor numero é " + menor);

    
    }
  }