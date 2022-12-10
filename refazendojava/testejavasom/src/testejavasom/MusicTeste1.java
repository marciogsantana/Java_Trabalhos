
package testejavasom;

import javax.sound.midi.*;

public class MusicTeste1 {

    
    public void play(){
        
        try{
        
        Sequencer sequencer = MidiSystem.getSequencer();
        
        System.out.println("we got a sequencer");
        
        
        } catch (MidiUnavailableException ex){
    
         System.out.println(" marcio gomes santana veja o recurso de memoria no pc");
         
         
        }

            
                
   
    
     }   

}