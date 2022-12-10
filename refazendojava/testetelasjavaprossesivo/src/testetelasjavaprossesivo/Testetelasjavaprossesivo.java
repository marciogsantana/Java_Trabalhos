
package testetelasjavaprossesivo;

import javax.swing.*;

public class Testetelasjavaprossesivo extends JPanel {

        public static void main(String[] args) {
  
        
        JFrame painel = new JFrame(" meu primeiro programa teste");
        
        Painel meuPainel = new Painel();
        
        painel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        painel.add(meuPainel);
        painel.setSize(1000, 1000);
        painel.setVisible(true);
            
        
        Lines panel = new Lines();
        painel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        painel.setSize( 250, 250 );
        painel.setVisible( true );
        painel.add( panel );
        
        
    }
    
}
