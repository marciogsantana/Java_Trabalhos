
import java.util.Scanner
public class Compara {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2,numero3,maior,menor;
        
        System.out.println("informe o primeiro numero");
        numero1 = entrada.nextInt();
        
        System.out.println("informe o segundo numero");
        numero2 = entrada.nextInt();
        
        System.out.println("informe o terceiro numero");
        numero3 = entrada.nextInt();
        
        maior = numero1
        menor = numero1
        if (numero2>maior){ 
            maior = numero2
                    }
        
        else if (numero2<maior){
             menor = numero2             
                    }
        if (numero3>maior){   
            maior = numero3
             
                    }
        else if (numero3<menor){
             menor = numero3
            
                    }       
             System.out.println("o maior numero é " + maior);
             System.out.println("o menor  numero é " + menor);  
    }
    
}
