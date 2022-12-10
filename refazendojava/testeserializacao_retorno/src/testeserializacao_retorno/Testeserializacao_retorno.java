
package testeserializacao_retorno;

import java.io.*;

public class Testeserializacao_retorno implements Serializable{

             
       
    public static void main(String[] args) {
    
     
       game one = new game(50, "elf", new String[]{ "bode", "cavalo", "camelo"});
       game two = new game (200, "troll", new String[]{"cadeira", "mesa","estante"});
       game tree = new game (120, "magico", new String[]{"brama","skol","antartica"});
       
       
       try{
           
           ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("game.ser")); 
           
           os.writeObject(one);
           os.writeObject(two);
           os.writeObject(tree);
           
           os.close();
           
       }catch(IOException ex){
           
           ex.printStackTrace();
       }
        
       one = null;
       two = null;
       tree = null;
       
       try{
           
           ObjectInputStream is = new ObjectInputStream (new FileInputStream("game.ser"));
           
           game oneRestore = (game) is.readObject();
           game twoRestore = (game) is.readObject();
           game treeeRestore = (game) is.readObject();
           
           System.out.println("One´s type: " + oneRestore.gettipo());
           System.out.println("two´s type: " + twoRestore.gettipo());
           System.out.println("tree´s type: " + treeeRestore.gettipo());
       
       }catch(Exception ex){
           
           ex.printStackTrace();
       }
       
             
      
       }
       
       
       
       
}    
    
  