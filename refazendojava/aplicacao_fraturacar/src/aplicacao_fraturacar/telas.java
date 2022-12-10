
package aplicacao_fraturacar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class telas extends JFrame implements ActionListener{
    
    //JFrame frame = new JFrame();
     
      private JButton button;
      private JButton button2;
      private JButton button3;
      private JButton button4;
      private JTextArea nomecartao;
      private JTextArea datafechamento;
      private boolean isShowAnswr;
    
     public void go(){
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        
        //panel.setBackground(Color.DARK_GRAY);
        
        
        
        frame.setTitle("Menu Aplicacao Cartoes de Credito");
         button = new JButton("Cadastros");
         button2 = new JButton("Lancamentos");
         button3 = new JButton("Consultas");
         button4 = new JButton("Sair");
        
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        
        panel.add(button);
        panel.add(button2);        
        panel.add(button3);
        panel.add(button4);
        frame.getContentPane().add(BorderLayout.WEST, panel);
        // frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        //frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        panel.setSize(1500, 1500);
        
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }

    
     
    @Override
    public void actionPerformed(ActionEvent evento) {
        
         
        
       button.addActionListener( new cadastros());
       button2.addActionListener( new lancamentos());
       button3.addActionListener( new consultas());
       button4.addActionListener( new sairaplicativo());
        
    }
    
    public class cadastros implements ActionListener{
         
        @Override
         public void actionPerformed(ActionEvent ev){
        
        JFrame frame = new JFrame();    
        Font bigFont = new Font("sanserif", Font.BOLD, 12);
        frame.setTitle("cadastro Cartao");
        JPanel panel = new JPanel();
        nomecartao = new JTextArea(15,30);
        nomecartao.setFont(bigFont);
        nomecartao.setLineWrap(isShowAnswr);
        nomecartao.setEditable(true);
        JScrollPane qscroller = new JScrollPane(nomecartao);
        qscroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qscroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(nomecartao);
        panel.add(qscroller);
        frame.getContentPane().add(BorderLayout.WEST, panel);
        frame.setSize(600, 150);
        frame.setVisible(true);
        } 
      }
        public class lancamentos implements ActionListener{
         
        @Override
         public void actionPerformed(ActionEvent ev){
        
        JFrame frame = new JFrame();    
        Font bigFont = new Font("sanserif", Font.BOLD, 12);
        frame.setTitle("Lancamentos");
        frame.setSize(600, 150);
        frame.setVisible(true);
       
     }
    
    }
        
       public class consultas implements ActionListener{
         
        @Override
         public void actionPerformed(ActionEvent ev){
        
        JFrame frame = new JFrame();    
        Font bigFont = new Font("sanserif", Font.BOLD, 12);
        frame.setTitle("Consultas");
        frame.setSize(600, 150);
        frame.setVisible(true);
       
     }
    
    } 
       public class sairaplicativo implements ActionListener{
         
        @Override
         public void actionPerformed(ActionEvent ev){
        
        System.exit(0);
       
     }
    
    } 
        
}