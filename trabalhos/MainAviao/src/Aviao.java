
public class Aviao {

    
    private int infonum;
	private int infopas;
	private Aviao prox;
	public Aviao(){
		this.prox = null;
		this.infopas = 0;
		this.infonum = 0;
	}
	public int getInfoNumeroPassageiro() {
		return this.infopas;
	}
	public void setInfoNumeroPasseiro(int infopas) {
		this.infopas = infopas;
	}
	
	public int getInfoNumeroAviao() {
		return this.infonum;
	}

	public void setInfoNumeroAviao(int infonum) {
	this.infonum = infonum;
	}
	
	public Aviao getProx() {
		return this.prox;
	}
	
	public void setProx(Aviao prox) {
		this.prox = prox;
	}
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

