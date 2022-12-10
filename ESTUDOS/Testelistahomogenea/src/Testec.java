
public class Testec {

    private static final int TMAX = 5;
    
    private final int nodos [];
    
    private int tamanho;
    
    public Testec(){
        
        
        this.nodos = new int [TMAX];
        
        this.tamanho = 0;
        
    }    
        
    public boolean listavazia(){
        
        return(this.tamanho == 0);
        
    }    
        
    public void inserir(int item){    
        
        if(this.tamanho <= TMAX-1){
        
            this.nodos[this.tamanho] = item;
        
            this.tamanho++;
        
        }
        
        
    }
    
    
    public void imprimir(){
        
        for (int i =0; i<this.tamanho; i++){
            
            System.out.println(nodos[i]);
        
       }
    
    }
    
    public int tamanholista(){ 

        return(this.tamanho);

    }


    public int localizar(int loc){

                   
          for (int i = 0; i <TMAX; i++){

                
               if (loc == nodos[i]){

                   nodos[i] = loc;
                 
               }            
        
               return(loc);
          }
    
          return(-1);
    }
    
    
    public int localizarposicao(int pos){

                    
          for (int i = 0; i <this.tamanho; i++){

               
              
               if (nodos[i] == pos){

                                     
                   pos = i; 
                   
               }            
        
               return(pos);
          }
    
          return(-1);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
