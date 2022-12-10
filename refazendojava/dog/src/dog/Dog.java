
package dog;


  
    class ddog{
        
        int tamanho;
        
        String nome;
        
        void latir() { 
        
           if (tamanho >60){
               
               System.out.println(" wooof wooof");
               
           } else if (tamanho > 14){
               
               System.out.println(" ruff ruff");
               
               
           }          
        
           else {
               
               System.out.println(" yip yip");
               
           }
        
           
           
           
           
    }
    
    }
    
    public class Dog {
    
    public static void main(String[] args) {
     
        ddog one = new ddog();
        
        one.nome = "nino";
        one.tamanho = 68;
        
        ddog dois = new ddog();
        
        dois.nome = "fera";
        dois.tamanho = 15;
        
        ddog tres = new ddog();
        
        tres.nome = "tata";
        tres.tamanho = 5;
        
        one.latir();
        dois.latir();
        tres.latir();
        
       
        
        
    }
    
}
