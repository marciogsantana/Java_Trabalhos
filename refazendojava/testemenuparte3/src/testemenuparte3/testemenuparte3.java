
package testemenuparte3;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class testemenuparte3 implements ActionListener {
    
    JFrame  frame;
    
    JLabel label;
    
 public  static void main(String[] args) {

     testemenuparte3 gui = new testemenuparte3();
     gui.go();
     
 }     

     public void go(){
         
         frame = new JFrame();
         
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JButton botao = new JButton("primeiro botao");
         
         botao.addActionListener(this);
         
         meupainel painel =  new  meupainel();
         
         frame.getContentPane().add(BorderLayout.SOUTH, botao);
         
         frame.getContentPane().add(BorderLayout.CENTER, painel);
         
         frame.setSize(300, 300);
         
         frame.setVisible(true);
         
         
     }
     
     
     

    @Override
    public void actionPerformed(ActionEvent event) {
        
    frame.repaint();
    
    }
    
    class meupainel  extends JPanel{
        
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
        
        
        
        
    }
 
    }
    

