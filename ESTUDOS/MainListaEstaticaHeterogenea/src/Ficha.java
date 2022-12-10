public class Ficha{

	private String nome;
	private float salario;

	public Ficha(){
	  this.nome    = "Ninguem";
	  this.salario = -1;
	}
	public Ficha(String n, float s){
	  if(s > 0) {
        this.nome    = n;
        this.salario = s;
      }
	}
    public void setNome(String p){
        this.nome = p;
      }
      public void setSalario(float p){
        if(p > 0){
          this.salario = p;    		
        }
      }
      public String getNome(){
        return(this.nome);
      }
      public float getSalario(){
        return(this.salario);
      }
  	
  }    
