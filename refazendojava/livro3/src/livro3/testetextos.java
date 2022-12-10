
package livro3;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JTextField;

import javax.swing.JPasswordField;

import javax.swing.JOptionPane;

public class testetextos extends JFrame {
    
    private JTextField texto1;
    
    private JTextField texto2;
    
    private JTextField texto3;
    
    private JPasswordField senha;
    
    public testetextos(){
        
        super (" testando textos ");
        
        setLayout (new FlowLayout());
        
    
         texto1 = new JTextField(10);
         
         add(texto1);
         
         texto2 = new JTextField(" tecla enter para continuar");
        
         add(texto2);
         
         texto3 = new JTextField("nao alterar");
         texto3.setEditable(false);
         add(texto3);
         
         senha = new JPasswordField(" verificando texto");
         add(senha);
         
         TextFieldHandler  handler = new TextFieldHandler();
         
         texto1.addActionListener(handler);
         
         texto2.addActionListener(handler);
         
         texto3.addActionListener(handler);
         
         senha.addActionListener(handler);
         
    }     
 
    
    private class TextFieldHandler implements ActionListener{
        
         @Override
        
         public void actionPerformed(ActionEvent event) {
                      
            String string = " ";
            
            if (event.getSource() == texto1){
                
                string = String.format("texto1: %s",event.getActionCommand());
                
            }    
            else if(event.getSource() == texto2){
                        
                        string = String.format("texto2: %s",event.getActionCommand());
                        
                        
            }    
                
             else if(event.getSource() == texto3){
                        
                        string = String.format("texto3: %s",event.getActionCommand());
                        
                        
            }     
            
             else if(event.getSource() == senha){
                        
                        string = String.format("senha: %s",event.getActionCommand());
                        
            }            
            
            
            JOptionPane.showMessageDialog(null, string);
        }

       
        
     }     
    }
    
    
    
    
    
    
    

