import java.util.Scanner;
public class Condicao {
    public static void main(String[] args) {
      
     Scanner entrada = new Scanner(System.in);   
        
     int nota;
     
     System.out.println("informe a nota");
     
     nota = entrada.nextInt();
             
     if (nota>=5 && nota<=7){       
         System.out.println("o aluno esta de recuperacao");
                }    
     else if (nota>7){    
         System.out.println("parabens o aluno esta aprovado");
                 }
     else if  (nota<4){ 
         System.out.println("o aluno esta reprovado");
                      }
     
    
    }
    
    
    
}
