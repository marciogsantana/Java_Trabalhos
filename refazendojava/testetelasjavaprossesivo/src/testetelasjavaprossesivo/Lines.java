
package testetelasjavaprossesivo;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Lines extends JPanel {
    
     public void paintComponent( Graphics g ){
    super.paintComponent( g );
    
    
    g.drawLine( 0, 0, 250, 250 );
    g.drawLine( 250, 250, 1000, 250 );
    }
    
    
    
    
    
    
    
    
    
    
    
}
