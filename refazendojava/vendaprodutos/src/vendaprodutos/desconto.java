
package vendaprodutos;


final public class desconto {

    private int horas;
    
    private double fator;
    
    private String dia;
    
    
    public desconto(){
    
    horas = 0;
    
    dia = "teste";
    
}
    
    
    public void setentradas(int horas, String dia){
    
    this.horas = horas;
    
    this.dia = dia;
    
    }   
   
  
    
    public double  getdescontar(){
        
        if (horas < 20 || dia == "sabado" || dia == "domingo"){  
            
          fator = 0.9;
            
        } 
        
        else {
            
              fator = 1;
        }
        
        
        return fator;
        
    }
    
    
  public void impressao(){
      
      
      System.out.println(horas);
      System.out.println(dia);
      System.out.println(fator);
      
  }
    
    
    
    
}
