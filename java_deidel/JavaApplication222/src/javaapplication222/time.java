
package javaapplication222;


public class time {

    
    private int hora;
    
    private int segundos;
    
    private int minutos;
    
  
    public void settime(int h, int s, int m){
        
        hora = (( h>= 0 && h<=24) ? h : 0);
        segundos = (( s>= 0 && s<=24) ? s : 0);
        minutos = (( m>= 0 && m<=24) ? m : 0);
        
        
    }
    
    public String universal(){
        
        return String.format("%d:%02d:%02d" ,hora, minutos, segundos) ;
        
    }    
        
    public String univ(){
        
        
        
        return String.format("%d:%02d:%02d %s",((hora == 0 || hora == 12) ? 12 : hora % 12), minutos, segundos, (hora < 12 ? "AM" : "PM")); 
           
    }
    
    
    
    
    
    
    
}
