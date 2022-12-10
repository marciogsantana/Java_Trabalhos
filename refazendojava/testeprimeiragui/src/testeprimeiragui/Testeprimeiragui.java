
package testeprimeiragui;

import javax.swing.*;

import java.awt.event.*;

    public class Testeprimeiragui implements ActionListener{
        
      private JButton botao,botao1;
    
        public void janela(){
            
            JFrame frame = new JFrame();
            
            botao = new JButton("clica aqui o filho da puta");
            botao1 = new JButton("clica aqui o filho da puta");
            
            //REGISTRA O EVENTO
            
            botao.addActionListener(this);
            botao1.addActionListener(this);
            
            frame.getContentPane().add(botao);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setSize(400,400);
            
            frame.setVisible(true);
       
         
       
        }
       
       @Override
       
       public void actionPerformed(ActionEvent evento) {
        
         botao.setText("Botão foi clicado! finalmente livro filho da puta ");
         botao1.setText("Botão foi clicado! finalmente livro filho da puta ");  
       
           //ALTERA A FONTE 
           
          // botao.setFont(new Font("SansSerif", Font.BOLD, 20));	
       
       
         }
       
       
                public static void main(String[] args) {       
       
                     lista l = new lista();
                
                    int k =  l.soma(4, 5);
                
                      
                     Testeprimeiragui  captura = new Testeprimeiragui ();
       
                     captura.janela();  
       
                    // meupainel painel = new meupainel(); 
       
                    // painel.PaintComponente(null);
                     
                    
                     
                     
       
         }    

        
}

