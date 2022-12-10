
package testeserializacao_retorno;

import java.io.*;
 
public class game implements Serializable{
    
    int poder;
    
    String tipo;
    
    String [] armas;
    
    
    public game (int p, String t, String[] w){
        
        poder = p;
        
        tipo = t;
        
        armas = w;
        
        
    }
    
    
    public int getpoder(){
        
        return(poder);
    }
    
    public String gettipo(){
        
        return(tipo);
        
    }
    
    public String getarmas(){
        
        String armaslista = "";
        
        for (int i = 0; i < armas.length; i++);
        
        return(armaslista);
        
    }
    
}
