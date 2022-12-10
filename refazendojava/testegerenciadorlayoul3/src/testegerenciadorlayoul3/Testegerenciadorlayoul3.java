
package testegerenciadorlayoul3;

import javax.swing.*;

import java.awt.*;
        
import java.awt.event.*;
        
public class Testegerenciadorlayoul3 implements ActionListener {
    
       JTextArea text;

    public static void main(String[] args) {

       Testegerenciadorlayoul3 gui = new Testegerenciadorlayoul3 ();
       
       gui.go();
        
    }
    
    public void go(){
        
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        
        JButton button = new JButton();
        
        button.addActionListener(this);
        
        text = new JTextArea(10,20);
        
        text.setLineWrap(true);
        
        JScrollPane scroller = new JScrollPane(text);
        
        scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
        panel.add(scroller);
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        
        frame.setSize(350, 300);
        frame.setVisible(true);
        
      
    
    
}

    @Override
    public void actionPerformed(ActionEvent ev) {
        
        text.append("button clicar \n ");
        
    }
}
