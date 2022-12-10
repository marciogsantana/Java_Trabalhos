
package comparacao;

import java.util.Scanner;

public class comparacao {

    public static void main(String[] args) {
        float num1, num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextFloat();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextFloat();
        
        System.out.printf("%.2f > %.2f -> %s\n", num1, num2, num1 > num2);
        System.out.printf("%.2f >= %.2f -> %s\n", num1, num2, num1 >= num2);
        System.out.printf("%.2f < %.2f -> %s\n", num1, num2, num1 < num2);
        System.out.printf("%.2f <= %.2f -> %s\n", num1, num2, num1 <= num2);
        System.out.printf("%.2f == %.2f -> %s\n", num1, num2, num1 == num2);
        System.out.printf("%.2f != %.2f -> %s\n", num1, num2, num1 != num2);
    }
}