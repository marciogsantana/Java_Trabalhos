import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite uma vogal minúscula: ");
        vogal = entrada.nextLine().charAt(0);
        
        
        switch( vogal )
        {
            case 'a' case 'A'
                System.out.println("Você está no case da vogal 'a'");
                break;
            case 'e' case'E'
                System.out.println("Você está no case da vogal 'e' ou 'E'");
                break;
            case 'i':
                System.out.println("Você está no case da vogal 'i'");
                break
            case 'o':
                System.out.println("Você está no case da vogal 'o'");
                break
            case 'u':
                System.out.println("Você está no case da vogal 'u'");
                break
        
            default:
                System.out.println("Você não digitou uma vogal minúscula");        
            
        }
        

    }
}
