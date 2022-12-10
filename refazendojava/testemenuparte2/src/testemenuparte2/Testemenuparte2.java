
package testemenuparte2;

import javax.swing.*;

import java.awt.*;

public class Testemenuparte2 extends JPanel {

        
    public static void main(String[] args) {
   
         JButton botao, botao1;
        
        botao = new JButton("clica aqui ");
        
        botao1 = new JButton("teste segundo botao");
         
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(500, 500);
        
        frame.setVisible(true);
         Graphics g;
        
        frame.getContentPane().add(BorderLayout.CENTER,botao);
        
        frame.getContentPane().add(BorderLayout.NORTH,botao1);
       
      
    
   }
}