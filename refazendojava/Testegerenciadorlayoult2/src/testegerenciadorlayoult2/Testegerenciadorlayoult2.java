package testegerenciadorlayoult2;

import javax.swing.*;

import java.awt.*;


public class Testegerenciadorlayoult2 {

    public static void main(String[] args) {
   
         Testegerenciadorlayoult2 gui = new Testegerenciadorlayoult2();
        
        gui.go();
        
    }
        
        public void go(){
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        
        panel.setBackground(Color.DARK_GRAY);
        
        JButton button = new JButton("estou aqui");
        JButton button2 = new JButton("filho da puta ggggggg");
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        
        panel.add(button);
        panel.add(button2);        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        
        frame.setSize(200, 200);
        frame.setVisible(true);
        
        
    }
    
}
