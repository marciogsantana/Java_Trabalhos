
import javax.swing.JOptionPane;

public class Tela {

    
    public static void main(String[] args) {
    
        String entrada;
        
        int numero1,numero2,soma;
        
        entrada = JOptionPane.showInputDialog("digite o primeiro numero");
        
        numero1 = Integer.parseInt(entrada);
        
        entrada = JOptionPane.showInputDialog("digite o segundo numero");
        
        numero2 = Integer.parseInt(entrada);
        
        soma = numero1 + numero2;
        
        JOptionPane.showInputDialog(null, "a soma  é" + soma );
        
        System.exit(0);
        
    }
    
}
