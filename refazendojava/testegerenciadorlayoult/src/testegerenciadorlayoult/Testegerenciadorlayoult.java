
package testegerenciadorlayoult;

import javax.swing.*;

import java.awt.*;

public class Testegerenciadorlayoult {

  
    public static void main(String[] args) {
   
        //JPanel panela = new JPanel();
        
        //JPanel panelb = new JPanel();
        
        //panelb.add(new JButton("botao 1"));
        
        //panelb.add(new JButton("botao 2"));
        
        //panelb.add(new JButton("botao 3"));
        
        //panelb.setVisible(true);
        
        //panelb.setSize(500, 500);
        
        //panela.add(panelb);
        
        
        Testegerenciadorlayoult gui = new Testegerenciadorlayoult();
        
        gui.go();
        
    }
    
    
    public void go(){
        
        JFrame frame = new JFrame();
        
       // JButton button = new JButton("clica aqui ");
        
       // Font bigFont = new Font("serif", Font.BOLD, 28);
        
       // button.setFont(bigFont);
        
       // frame.getContentPane().add(BorderLayout.EAST, button);
        
       // frame.setSize(200, 200);
        
       // frame.setVisible(true);
        
       JButton east = new JButton("east"); 
       JButton west = new JButton("west"); 
       JButton north = new JButton("north");
       JButton south = new JButton("south");
       JButton center = new JButton("center");
       
       frame.getContentPane().add(BorderLayout.EAST, east);
       frame.getContentPane().add(BorderLayout.WEST, west);
       frame.getContentPane().add(BorderLayout.NORTH, north);
       frame.getContentPane().add(BorderLayout.SOUTH, south);
       frame.getContentPane().add(BorderLayout.CENTER, center);
        
       frame.setSize(300, 300);
       frame.setVisible(true);
        
    }
    
    
    
    
}
