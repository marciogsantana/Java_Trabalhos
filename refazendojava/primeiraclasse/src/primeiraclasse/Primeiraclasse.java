
package primeiraclasse;

import java.io.InputStream;
import java.util.Scanner;

public class Primeiraclasse {

    public static void main(String[] args) {
    
        Scanner entrada = Scanner(System.in);

        
        alunos marcio = new alunos();
                       
        marcio.alunos = entrada.nextLine();
        marcio.notfisica = entrada.nextDouble();
        marcio.notmatem = entrada.nextDouble();
        
        alunos laura = new alunos();
        
        laura.alunos = entrada.nextLine();
        laura.notfisica = entrada.nextDouble();
        laura.notmatem = entrada.nextDouble();
        
        alunos juliane = new alunos();
        
        juliane.alunos = entrada.nextLine();
        juliane.notfisica = entrada.nextDouble();
        juliane.notmatem = entrada.nextDouble();
        
        System.out.printf(" os alunos sao %d \t %d \t %d \t \n", marcio.alunos,laura.alunos,juliane.alunos);
        System.out.printf(" as notas foram %.2f \t %.2f \t %.2f \t \n", marcio.notfisica,marcio.notmatem);
        
        
        
        
        
        
    }

    private static Scanner Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
