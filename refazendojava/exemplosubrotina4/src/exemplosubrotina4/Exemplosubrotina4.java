
package exemplosubrotina4;


public class Exemplosubrotina4 {

   
    public static int subrotina4(int p1, int p2){
    
        
        int a, b, soma;
        
        a = p1;
        
        b = p2;
        
        soma = a+b;
        
        return(soma);
        
    }
    
    public static void main(String[] args) {
    
        int x, y;
        
        x = 11;
        
        y = 11;
        
        int s = subrotina4(x, y);
        
        System.out.println("o valor da soma " + s);
        
    }
    
}
