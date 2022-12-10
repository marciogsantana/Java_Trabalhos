import java.util.Scanner;
public class Mediaw {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    int alunos,cont,soma,nota,total;
    soma = 0
    cont = 0
    System.out.println("infome o numero de alunos que terao a nota lançada");
    alunos = entrada.nextInt();
    cont = alunos   
        while (cont>=1){
            
           System.out.println("informe a nota do aluno");
           nota = entrada.nextInt();
           soma = (soma+nota);
           cont = (cont-1)        
        }
    total = (soma/alunos);
    System.out.println("a media das notas é " + total)  
         
        
    }
    
}
