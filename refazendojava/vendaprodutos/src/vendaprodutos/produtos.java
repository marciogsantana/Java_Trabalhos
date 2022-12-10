
package vendaprodutos;

public class produtos {
 
    private double produto;
    
    
    private double preco;
    
    private double soma;
    
    private double quantidade;
    
    private desconto indice, r;
    
    
    
    
public void setvender(double produto, double preco, double quantidade, desconto indice){

    
           this.produto = produto;

           this.preco = preco;

           this.quantidade = quantidade;


           this.indice = indice;


}

desconto t = new desconto();




public double gettotal(){
    
    
    this.soma = (this.quantidade * this.preco) * t.getdescontar(); 
    
     return(soma);
    
      
    
  }


public double getquantidade(){
    
    return this.quantidade;
}

 
public double getpreco(){
    
    return this.preco;
}

public double getproduto(){
    
    return this.produto;
}

}    