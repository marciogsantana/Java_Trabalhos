
package exemplodoutor;

public class myanimallist {

    private doctor [] doutores1 = new doctor [5];
    
    private int nexindex = 0;
    
    public void add (doctor a){
        
        if (nexindex < doutores1.length){
            
            doutores1[nexindex] = a;
            
            System.out.println(" doctor adicionado em " + nexindex);
            
            nexindex++;
            
        }
        
        
    }
    
    
    
}
