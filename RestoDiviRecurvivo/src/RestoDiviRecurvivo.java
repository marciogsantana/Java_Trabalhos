import java.util.Scanner;

public class RestoDiviRecurvivo{
	public static int resto(int x, int y) {
	   if(x < y){
  	      return(x);
	   } else {
              return( resto(x-y,  y) );
           }
        }

	public static void main(String args[]){
	    int num, den, r;
            Scanner entrada = new Scanner(System.in); 
            System.out.println("Digite o numerador:");
            num = entrada.nextInt();
            System.out.println("Digite o denominador:");
            den = entrada.nextInt();
            r = resto(num, den);
            System.out.println("O resto eh: " + r);
	}
}

