
package testeserializacao;

import java.io.*;

public class Testeserializacao implements Serializable {

         private int teste1;
         
         private int teste2;
         
        
    
    
    
    public static void main(String[] args) {

        
        
        Testeserializacao tata = new Testeserializacao();
        
        tata.setteste(50, 100);
        tata.soma();
        
        try{
            
                      
           ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("foo.ser"));
           
           os.writeObject(tata);
           
           os.close();
           
        } catch(Exception ex) {
            ex.printStackTrace();
        
              
        
    }
    
         try{
            
                    
           ObjectInputStream is = new ObjectInputStream(new FileInputStream("foo.ser"));
        
           Testeserializacao tataRestore = (Testeserializacao) is.readObject();
           
           } catch(Exception ex) {
            ex.printStackTrace();
        
        
    }
        
       
         Testeserializacao marcio = (Testeserializacao) tata;
         
         
         
    } 
    public void setteste(int t, int t1){
        
        teste1 = t;
        teste2 = t1;
     
    }    
    public int soma(){
        
              
        int soma = teste1+teste2;
        
       
        return(soma);
        
}    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}    
        

    
    

