package exrcicio4;

import java.util.Scanner;
import java.util.Calendar;

public class Exrcicio4 {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        int ano_atual;
        int ano_nascimento;
                
        System.out.println("informa a idade");
        idade = entrada.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        
        ano_atual = calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade; 
        
        
        
        System.out.println(" a idade é " + ano_nascimento);
        
                
        
    }
    
}
