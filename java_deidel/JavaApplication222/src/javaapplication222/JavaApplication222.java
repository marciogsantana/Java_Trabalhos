
package javaapplication222;


public class JavaApplication222 {

    public static void main(String[] args) {
   
        time t = new time();
        
        System.out.println("teste");
        System.out.println(t.universal());
        System.out.println(t.univ());
        
        t.settime(13, 6, 27);
        
        System.out.println(t.universal());
        System.out.println(t.univ());
        
        t.settime(99, 99, 99);
        
        System.out.println(t.universal());
        System.out.println(t.univ());
        
        
    }
    
}
