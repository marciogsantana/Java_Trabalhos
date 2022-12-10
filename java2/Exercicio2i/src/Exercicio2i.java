import java.util.Scanner;

  public class Exercicio2i {

    public static void main(String[] args) { 
    
     Scanner entrada = new Scanner(System.in);
     
     System.out.println(" informe o numero " );
     
     int cont,par,impar,resto,total;
     
     par = 1;
     impar = 1;
        
       cont = entrada.nextInt();
       
       for(cont = cont; cont > 0; cont--){
        
           resto = cont%2;
           
           if (resto == 0){
               
             par = (par*cont);
           }    
           else {    
               
            impar = (impar*cont);
                       
           }
       }
       
      System.out.println(" o produto dos numeros pares é " + par);
      System.out.println(" o produto dos numeros impares é " + impar); 
    }
    
  }
