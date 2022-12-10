
public class Classesimples {

    int [] localizacao;
    
    int acerto = 0;
    
    public void setLocalizar (int [] locs){
        
        localizacao = locs;
    }
    
    public String getConverte (String pergunta){
    
            int numero = Integer.parseInt(pergunta);
           
            String resultado = "miss"; 
    
            for (int ce : localizacao){  
    
                 if (numero == ce) { 
    
                    resultado = "hit";  
    
                    acerto++;
    
                    break;
    
                 }
                 
            }     

            if (acerto == localizacao.length){
            
                     resultado = "kill";
            
            }         
                     
                     
            System.out.println(resultado);
                     
            return resultado;         
         
            
            
    }    
            
}