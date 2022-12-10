import java.util.Scanner;

public class Exercicio3poo {

   
    public static void main(String[] args) {
   
        
        Scanner entrada = new Scanner(System.in);
        
        Alunos alt = new Alunos();
        
        System.out.println("informe os dados dos alunos");
        
        alt.nome("marcio gomes santana");
        
        alt.endereco("rua sao pedro de alcantara");
        
        alt.cargos("gerente");
        
        alt.idade(entrada.nextInt());
        
        alt.salario(entrada.nextInt());
        
        System.out.println(" o nome do aluno é " + alt.nome("marcio gomes santana"));
        System.out.println(" o cargo aluno é " + alt.cargos("gerente"));
        System.out.println(" o endereco é " + alt.endereco("rua sao pedro de alcantara"));
        System.out.println(" a idade  do aluno é " + alt.idade);
        System.out.println(" o salario do aluno é " + alt.salario);
     
    
    }
    
}
