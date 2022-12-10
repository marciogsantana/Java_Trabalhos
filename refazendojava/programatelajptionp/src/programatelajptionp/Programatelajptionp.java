
package programatelajptionp;


import javax.swing.JOptionPane;

import java.util.Scanner;



public class Programatelajptionp {

    public static void main(String[] args) {
   
        
        JOptionPane.showMessageDialog(null, " testando classe \n teste tese \n marcio gomes de santana");
        
        
        String mensagem, meme1, meme2,resultado;
        
        int numero1,numero2,soma;
        
        Scanner entrada = new Scanner(System.in);
        
        
        JOptionPane.showMessageDialog(null, " digite a mensagem a ");
        
        mensagem = JOptionPane.showInputDialog(" informe seu nome");
        
        
        
        JOptionPane.showMessageDialog(null, mensagem);
        
        meme1 = JOptionPane.showInputDialog(" informe o primeiro numero");
        
        numero1 = Integer.parseInt(meme1.trim());
        
        meme2 = JOptionPane.showInputDialog(" informe o segundo numero");
        
        numero2 = Integer.parseInt(meme2.trim());
        
        soma = numero1+numero2;
        
        resultado = String.format("resultado: %d" , soma);
        
        JOptionPane.showMessageDialog(null,resultado);
                
        
        
    }
    
}
