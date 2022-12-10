
package testematch;


public class Testematch {

    
    
    public static void main(String[] args) {
      
        
       int  valor = (int) (Math.random() * 100);
        
       int valor1 = valor+1;
       
       int valor2 = valor+2;
       
       double pii =  Math.PI;
       
       double e = Math.E;
       
       int maximo = Math.max(valor, valor1);
       
       int minimo = Math.min(valor, valor1);
       
        System.out.printf(" primeiro valor %d  \n segundo valor %d  \n terceiro valor %d  \n", valor,valor1,valor2);
        System.out.printf(" o valot de pi é %.2f \n e o valor euler é %.2f\n",pii, e);
        System.out.printf(" o valor maximo é %d \t \n e o vamor minimo é %d \t\n",maximo, minimo);
        
        
        
    }
    
}
