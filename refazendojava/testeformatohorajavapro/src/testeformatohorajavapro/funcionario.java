
package testeformatohorajavapro;

public class funcionario {
    
    private String nome;
    
    private boolean atraso;
    
    private double tempotrabalhado, tempoatraso;
    
    public funcionario (String nome, hora horachegada, hora horasaida){
        
        this.nome = nome;
        
        this.tempoatraso = tempoatraso;
             
        if (this.tempoatraso > 0){
            
            this.atraso = true;
            
        }
        
        if(atraso){
            System.out.println("Funcionário '" + this.nome + "' atrasado. ");
        }
        
         this.tempotrabalhado = horastrabalhadas(horachegada, horasaida);
        
    }
    
    public double tempoAtraso(hora horachegada){
        return ((horachegada.gethoras()*60*60 + horachegada.getmin()*60 + 
                 horachegada.getsecondus()) - 8*3600.0)/3600.0;
    }
    
    
    public double horastrabalhadas(hora horachegada, hora horasaida){
        double horas = ( (horasaida.gethoras()*60 + horasaida.getmin()) - 
                       (horachegada.gethoras()*60 + horachegada.getmin()) )/60.0;
        
        if(horas < 0)
            throw new IllegalArgumentException("Hora de saída anterior a hora de chegada");
        
        return horas;
    }
    
    public double getHorasTrabalhadas(){
        return this.tempotrabalhado;
    }

   
    
    
    
    
    
    
    
    
    
    
}
