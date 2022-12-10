
package testeformatohorajavapro;


public class hora {

    private int hours,minutes,seconds;
    
    
    public hora (int hours, int minutes, int seconds){
        
        if (hours >= 0 && hours <24 ){
        
             this.hours = hours;
        
        }
        
        else {
                
             throw new IllegalArgumentException("Hora inválida");  
                
                
        
        }
    
        if (minutes >= 0 && minutes <60 ){
        
             this.minutes = minutes;
        
        }
        
        else {
                
             throw new IllegalArgumentException("minutos invalidos");  
                
                
        
        }
    
    
    if (seconds >= 0 && seconds <60 ){
        
             this.seconds = seconds;
        
        }
        
        else {
                
             throw new IllegalArgumentException("segundos invalidos");  
                
                
        
        }
 
    }   
        public int gethoras(){
    
           return this.hours;
      
       }
    

        public int getmin(){
    
           return this.minutes;
      
       }
 
        
         public int getsecondus(){
    
           return this.seconds;
      
       }

         
      @Override  
         
      public String toString(){
          
          return String.format("%d:%d:%d:", gethoras(),getmin(),getsecondus());
          
          
      }   
    
}

