
public class Provamarcio {

     public static void sub1(double x ) {
    
    double f, k, t, t1, t2, t3;
    
    f = 1.8;
    
    k = 32;
    
    t = (x * 1.8) + 32.0;
		System.out.println("Convertendo" + x + "graus Celsius para Fahrenheit : " + t);
                
    t1 = (x - 32.0) / 1.8;
		System.out.println("Convertendo" + x + "graus Fahrenheit para Celsius : " + t1);
                
    
    t2 = x - 273.5;
		System.out.println("Convertendo" + x +" graus Kelvin para Celsius : " + t2);
		                        
                
    t3 = x + 273.5;
		System.out.println("Convertendo" + x + " graus Celsius para Kelvin : " + t3);
 
                
  
   }                
    public static void main(String[] args) {
   
             
        sub1(127);
        sub1(99);
        
        
        
    }
}
