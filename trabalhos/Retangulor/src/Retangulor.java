import java.util.Scanner;

public class Retangulor {

    public static void main(String[] args) {

        Ret retangulo = new Ret();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe a largura");
        
        retangulo.setlarg(entrada.nextInt());
        
        System.out.println("informa a altura");
        
        retangulo.setaltu(entrada.nextInt());
        
        
        System.out.println("o perimetro é " + retangulo.getcalculararea());
        
        
    }
    
}
