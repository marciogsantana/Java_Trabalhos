import java.util.Scanner;

public class LeituraMatriz{

    public static void main(String[] args){

        int [][] matriz = new int[3][3];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz M[3][3]\n");

        for(int linha=0 ; linha < 3 ; linha++){
           for(int coluna = 0; coluna < 3 ; coluna ++){
              System.out.println("Digite M[" + (linha+1) + "][" + (coluna+1) + "]");
              matriz[linha][coluna]=entrada.nextInt();
           }
        }
	     entrada.close();
    }
}
