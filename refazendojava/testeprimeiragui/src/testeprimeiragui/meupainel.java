
package testeprimeiragui;

import java.awt.*;

import javax.swing.*;


public class meupainel  extends JPanel{
    
    public void paintComponente1 (Graphics g){
        
        g.setColor(Color.orange);
        
        g.fillRect(20, 20, 100, 100);
        
    }
    
    public void PaintComponente2 (Graphics g){
        
        Image image = new ImageIcon("bug1.jpg").getImage();
        
        g.drawImage(image, 3, 4, this);
        
        
        
        
    }
    
    public void paintComponente (Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        
        int red = (int) (Math.random() * 255);
        int greem = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        
        Color startcolor = new Color(red,greem,blue);
        
        red = (int) (Math.random() * 255);
        greem = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        
        Color endcolor = new Color(red,greem,blue);
        
        GradientPaint gradientet = new GradientPaint(70,70,startcolor,150,150,endcolor);
        g2d.setPaint(gradientet);
        g2d.fillOval(70, 70, 100, 100);
        
    }

    void PaintComponente(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
