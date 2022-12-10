
package aplicativo_jogo_cartoes;

import java.util.*;

import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import java.io.*;

public class QuizCardBuilder {

    private JTextArea question;
    
    private JTextArea answer; 
    
    private ArrayList<QuizCard> cardlist;
    
    private JFrame frame;
    
    
    public void go(){
        
        frame = new JFrame("QuizCardBuilder");
        
        JPanel mainpanel = new JPanel();
        
        Font bigFont = new Font("sanserif", Font.BOLD, 24);
        
        question = new JTextArea(6,20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);
        
        JScrollPane qscroller = new JScrollPane(question);
        qscroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qscroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        answer = new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);
        
        JScrollPane ascroller = new JScrollPane(question);
        ascroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ascroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        JButton nexButton = new JButton ("Next Card");
        
        cardlist = new ArrayList<QuizCard>();
        
        JLabel qlabel = new JLabel("Question:");
        JLabel alabel = new JLabel("Answer:");
        
        mainpanel.add(qlabel);
        mainpanel.add(qscroller);
        mainpanel.add(alabel);
        mainpanel.add(ascroller);
        mainpanel.add(nexButton);
        
        nexButton.addActionListener(new NextCardListener());
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu filemenu = new JMenu("File");
        
        JMenuItem newMenuItem = new JMenuItem("new");
        
        JMenuItem saveMenuItem = new JMenuItem("save");
        
        newMenuItem.addActionListener(new NewMenuListener());
        
        saveMenuItem.addActionListener(new SaveMenuListener());
        
        filemenu.add(newMenuItem);
        filemenu.add(saveMenuItem);
        menubar.add(filemenu);
        frame.setJMenuBar(menubar);
        frame.getContentPane().add(BorderLayout.CENTER, mainpanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
        
       }
        
       public class NextCardListener implements ActionListener{
           
           

        @Override
        public void actionPerformed(ActionEvent ev) {
          
          QuizCard card = new QuizCard(question.getText(),answer.getText());
               
               cardlist.add(card);
               
               clearCard(); 
        
        
       }
    
       }   
       public class SaveMenuListener implements ActionListener{    

            @Override
            public void actionPerformed(ActionEvent ev) {
                
                QuizCard card = new QuizCard(question.getText(),answer.getText());
                
                cardlist.add(card);
                
                JFileChooser filesave = new JFileChooser();
                
                filesave.showSaveDialog(frame);
                
                saveFile(filesave.getSelectedFile());
                
                
            }
    
       }    
        public class NewMenuListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent ev){
                
                cardlist.clear();
                clearCard(); 
            }
        }
    
    
        private void clearCard(){
            
            question.setText("");
            answer.setText("");
            question.requestFocus();
            
        }
     
        private void saveFile( File file){
            
            try{
                
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                
                for (QuizCard card: cardlist){
                    
                    writer.write(card.getquestion() + "/");
                    writer.write(card.getanswer() + "\n");
                }
                
                writer.close();
                
            }catch (IOException ex){
                
                System.out.println("couddn´ t write the cardlist out");
                ex.printStackTrace();
            }
            
            
        }
    
    
       }
    

