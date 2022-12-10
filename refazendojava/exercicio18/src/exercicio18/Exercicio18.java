
package exercicio18;

import java.util.Scanner;

public class Exercicio18 {

   
    public static void main(String[] args) {
   
        
        int notas, alunos, cont, soma, media;
        
        
        System.out.println("informe o numero de alunos");
                
           Scanner entrada = new Scanner(System.in);
           
           alunos = entrada.nextInt();
           
           
           cont = 0;
           
           soma = 0;
           
           while(cont < alunos){
               
               System.out.println("informe a nota do aluno");
               
                     notas = entrada.nextInt();
                     
                     soma = soma + notas;
                   
                     cont ++;
               
           }    
               
            media = soma/alunos;   
               
           System.out.println("A media dos alunos foram" + media );
               
           }
        
        
        
    }
    
