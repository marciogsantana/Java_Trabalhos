
package apicativojavasound;

import javax.sound.midi.*;



public class Apicativojavasound {

   
    public static void main(String[] args) {
  
        Apicativojavasound  mini = new Apicativojavasound ();
        
        mini.play();
        
    }    
        public void play(){
            
         try{   
            
            Sequencer player = MidiSystem.getSequencer();
            
            player.open();
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            
            Track track = seq.createTrack();
            
            
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent (a, 1);
            track.add(noteOn);
            
            
            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, 44, 100);
            MidiEvent noteOFF = new MidiEvent (b, 16);
            track.add(noteOFF);
            
            player.setSequence(seq);
            
            player.start();
            
            Thread.sleep(1000 * 2 );
            
            player.close();
            
            System.exit(0);
            
        } catch (Exception ex){
            
            ex.printStackTrace();
            
            
        }
        
        
        
        
        
    }
    
}
