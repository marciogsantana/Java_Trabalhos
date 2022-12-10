
package aplicativo_jogo_cartoes;

import java.util.*;

import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import java.io.*;

public class QuizCardplayer {

    private JTextArea display;
    
    private JTextArea answer; 
    
    private ArrayList<QuizCard> cardlist;
    
    private QuizCard currentCard;
    
    private int currentCardindex;
    
    private JFrame frame;
    
    private JButton nextButton;
    
    private boolean isShowAnswr;
    
    public void go(){
    
    frame = new JFrame("Quiz Card player");
        
        JPanel mainpanel = new JPanel();
        
        Font bigFont = new Font("sanserif", Font.BOLD, 24);
        
        display = new JTextArea(10,20);
        display.setFont(bigFont);
        display.setLineWrap(isShowAnswr);
        display.setEditable(false);
        
        JScrollPane qscroller = new JScrollPane(display);
        qscroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qscroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        nextButton = new JButton(" Show Question");
        mainpanel.add(qscroller);
        mainpanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu filemenu = new JMenu("File");
        
        JMenuItem LoadMenuItem = new JMenuItem("load card set");
        
        LoadMenuItem.addActionListener(new OpenMenuListener());
        
        filemenu.add(LoadMenuItem);
        menubar.add(filemenu);
        frame.setJMenuBar(menubar);
        frame.getContentPane().add(BorderLayout.CENTER, mainpanel);
        frame.setSize(640, 500);
        frame.setVisible(true);
        
    }
        
        
     public class NextCardListener implements ActionListener{
         
         @Override
         public void actionPerformed(ActionEvent ev){
          
             if (isShowAnswr){
             
             display.setText(currentCard.getanswer());
             
             nextButton.setText("Next Card");
             
             isShowAnswr = false;
             
             } else {
                 
                 if (currentCardindex < cardlist.size()){
                     
                     showNextCard();
                     
                 } else{
                     
                     display.setText("That was last card");
                     nextButton.setEnabled(false);
                 }
                 
             }  
         }
        }   
    
    
        public class OpenMenuListener implements ActionListener{
            
        @Override
        public void actionPerformed(ActionEvent e) {
          
            JFileChooser fileopen = new JFileChooser();
            fileopen.showOpenDialog(frame);
            LoadFile(fileopen.getSelectedFile());
             
        }
            
        }
    
       private void LoadFile (File file){
           
           cardlist = new ArrayList<QuizCard>();
           
           try{
               
                BufferedReader reader = new BufferedReader(new FileReader(file));
               
                String line = null;
                
                while((line = reader.readLine()) != null){
                    
                    makeCard(line);
                }
                
                reader.close();
                
            }catch(Exception ex){
                
                System.out.println("couldn´t read the card file");
                ex.printStackTrace();
                 
           }
           
           showNextCard();
       }
    
       private void makeCard(String lineToparse){
           
           String[] result = lineToparse.split("/");
           
           QuizCard card = new QuizCard(result[0], result[1]);
           
           cardlist.add(card);
           
           System.out.println("made a card");
           
           
         }
       
        private void showNextCard(){
            
            currentCard = cardlist.get(currentCardindex);
            currentCardindex++;
            display.setText(currentCard.getquestion());
            nextButton.setText("Show Answer");
            isShowAnswr = true;
        } 
}