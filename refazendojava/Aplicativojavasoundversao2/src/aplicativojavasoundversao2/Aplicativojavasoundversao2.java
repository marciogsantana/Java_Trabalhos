
package aplicativojavasoundversao2;

import javax.sound.midi.*;


public class Aplicativojavasoundversao2 {

    
    public static void main(String[] args) {
   
        Aplicativojavasoundversao2 mini = new Aplicativojavasoundversao2();
        
        if (args.length < 2){
            
            System.out.println(" nao esqueca dos argumentos e das notas");
       
        } else{
            
               int instrument = Integer.parseInt(args[0]);
               int note = Integer.parseInt(args[1]);
               mini.play(instrument, note);
               
        }
        
    }   
        
        
    public void play(int instrument, int note){
            
         try{   
            
            Sequencer player = MidiSystem.getSequencer();
            
            player.open();
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            
            Track track = seq.createTrack();
            
    
            MidiEvent event = null;
    
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument,0);
            MidiEvent changeInstrument = new MidiEvent (first, 1);
            track.add(changeInstrument);
            
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent (a, 1);
            track.add(noteOn);
             
            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, note, 100);
            MidiEvent noteOFF = new MidiEvent (b, 16);
            track.add(noteOFF);
            player.setSequence(seq);
            player.start();
    
            } catch (Exception ex){ex.printStackTrace();}
            
           
             
    
    
    
    
        
    }
    
}