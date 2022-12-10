
public class Listah {

    private static final int TMAX=5;
    
    private final int  [] nodos;
    
    private int tamanho;
    
    public Listah(){
    
    
        this.nodos = new int [TMAX];
    
        this.tamanho = 0;
    
    }
    
    
    public boolean listavazia(){
    
      return(this.tamanho==0);
    
    } 
    
    public void inserir(int item){
        
        if (this.tamanho <= (TMAX -1)){
         
            this.nodos[this.tamanho] = item;
        
            this.tamanho++; 
        
        }
        
    }
    
    public void imprimir(){ 
    
     for (int i = 0; i <this.tamanho; i++){ 
    
          System.out.println(nodos[i]);
    
    
     }
    
    }
    
    public int tamanholista(){
        
        return(this.tamanho);
        
    }    
        
    public int localizar(int pos){
  
        int contador;
        
        contador = 0;
                  
        for (int i = 0; i<this.tamanho; i++){

             contador++;
            
            if (nodos[i] == pos){ 
            
                               
               pos = contador;
          
                              
               return(pos);   

            }

        }
        
            return(-1);
    }

    public int localizarnodos(int loc){
    
                  
           for (int i = 0; i<this.tamanho; i ++){
    
                 if (loc == this.nodos[i]){
    
                     return(loc);                
                   
                 }
           }
    
           return(-1);     
    
    
    
    
    
 }    

}