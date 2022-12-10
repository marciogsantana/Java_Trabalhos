
public class Ficha {

    private String nome;
    
    private float salario;
    
    public Ficha(){
        
        this.nome = "ninguem";
        this.salario = -1;
    }    
        
    public Ficha(String n, float s){
        
        if (s > 0){
            
            this.nome = n;
            this.salario = s;
       }
        
    }    
        
    public void setnome(String p){    
        
        this.nome = p;
    }    
        
    public void setsalario(float p){
        
        if (p >0 ){
        
        this.salario = p;
        
        }    
    }    
    
    public String getnome(){
        
        return(this.nome);
    }
    
    public float getsalario(){
    
        return(this.salario);
    
    }
    
    
    
    
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
