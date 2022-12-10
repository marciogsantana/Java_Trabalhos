
package livro1;

import javax.swing.JOptionPane;

public class Livro1 {

    public static void main(String[] args) {
    
        String  numero, numero2, soma1;
        
             
        numero = JOptionPane.showInputDialog("informe o primeiro numero");
        
        numero2 =  JOptionPane.showInputDialog("informe o primeiro numero");
        
        int nu1 = Integer.parseInt(numero);
        
        int nu2 = Integer.parseInt(numero2);
        
        int soma = nu1 + nu2 ;
        
       JOptionPane.showMessageDialog(null, " a soma é " +soma);
        
    }
    
}
