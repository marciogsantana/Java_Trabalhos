
package projetomarcioaviao;



public class aviao {
 
    private int numeroaviao;
    
    private int numeropassageiros;
    
    
    public aviao(){
    
    this.numeroaviao = 0;
    
    this.numeropassageiros = 0;
    
    
   }
    
    
   public void setentrada(int num, int num1){
       
       this.numeroaviao = num;
       
       this.numeropassageiros = num1;
       
       
       
   } 
    
   public int getnumeroaviao(){
       
       return(this.numeroaviao);
       
   }
    
   public int getnumeropasageiros(){
   
   return(this.numeropassageiros);
       
}

   
   
   
}   
   