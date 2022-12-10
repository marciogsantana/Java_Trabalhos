
public class Fichamarcio {
   
    private  String nome;
    
    private  float salario;
    
    public Fichamarcio(){
        
        this.nome = "ninguem";
        this.salario = -1;
        
    }    
        
    public Fichamarcio(String n, float s){
        
        if (s > 0){
            
            this.nome = n;
            
            this.salario = s;
            
        }    
         
    }    
        
        
    public void setnome(String p){
        
        this.nome = p;
        
    }    
        
    public void setsalario(float p){    
        
        this.salario = p;
        
    }    
        
    public String getnome(){
        
        return(this.nome);
        
    }
    
    public float getsalario(){
        
        return(this.salario);
        
    }    
        
        
        
        
        
}
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

