
package superbatalhanaval;


import java.util.*;

public class Dotcom {
    
    private ArrayList<String> locationcells;
    
    private String name;
    
    
    public void setlocationcells(ArrayList<String> loc){
    
    locationcells = loc;
    
    }
    
    public void setname(String n){
    
        name = n;
        
    }
        
    public String checkyourself(String userInput){
        
        String result = "errado";
        
        int index = locationcells.indexOf(userInput);
        
        if (index >=0) {
            
            locationcells.remove(index);
            
            if (locationcells.isEmpty()){
            
                  result = "eliminar";
                  
                  System.out.println("ora voce afundou a  " + name + " : (");
                  
            } else {
                
                  result = "correto";
            }      
       }      
       
            return result;
        
    }
        
        
}
    
    
    
    
    
    
    

