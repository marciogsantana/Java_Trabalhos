import java.util.Scanner;

public class Exercio3lista1 {

    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o primeiro numero");
        
        int numero1,numero2,numero3,numero4,numero5,media,maior,menor;
        
        maior = 0;
        
        menor = 1000000000;
                
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
        
        numero2 = entrada.nextInt();
        
        System.out.println("informe o terceiro numero");
        
        numero3 = entrada.nextInt();
        
        System.out.println("informe o quarto numero");
        
        numero4 = entrada.nextInt();
        
        System.out.println("informe o quinto numero");
        
        numero5 = entrada.nextInt();
        
        media = (numero1+numero2+numero3+numero4+numero5)/5;
        
        
        if (numero1 > maior){
        
            maior = numero1;
            menor = numero1; 
    
        }
    
        if (numero2 > maior){
    
            maior = numero2;
    
        }
        
        else if (numero2 < menor){ 
    
             menor = numero2;
        }
        
        if (numero3 > maior){
    
            maior = numero3;
    
        }
        
        else if (numero3 < menor){ 
    
             menor = numero3;
        }
        
        
        if (numero4 > maior){
    
            maior = numero4;
    
        }
        
        else if (numero4 < menor){ 
    
             menor = numero4;
        }
        
        if (numero5 > maior){
    
            maior = numero5;
    
        }
        
        else if (numero5 < menor){ 
    
             menor = numero5;
        }
        
        System.out.println(" a media é " + media);
        System.out.println(" o maior numero é " + maior);
        System.out.println(" o menor numero é " + menor);
        System.out.println(" os numeros na ordem inversa é " + numero5 + "," + numero4 + "," + numero3 + "," +numero2 +"," + numero1);
        
    }
}    