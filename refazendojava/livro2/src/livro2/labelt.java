
package livro2;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.SwingConstants;

import javax.swing.Icon;

import javax.swing.ImageIcon;


public class labelt extends JFrame {
    
        private JLabel label1;
        
        private JLabel label2;
        
        private JLabel label3;
    
    
    
    
    public labelt(){
        
        
       super (" Testando label");
        
       setLayout (new FlowLayout());
       
      label1 = new JLabel( " primeiro label");
       
      label1.setToolTipText("testetando novamento a primeira label");
      
      add(label1);
        
            
     label2 = new JLabel( " segundo label",  SwingConstants.LEFT);
      
      Icon bug = new ImageIcon(getClass().getResource("bug1.jpg"));
     
     label2.setToolTipText("testetando novamento a segunda label");
      
       add(label2);
       
      label3 = new JLabel();
       
       label3.setText("terceira label");
                   
      label3.setIcon(bug);
       
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
       
       label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      
        label3.setToolTipText("testetando novamento a terceira label");
       
            
       add(label3);
      
        
    }

    
    
    
    
    
}

