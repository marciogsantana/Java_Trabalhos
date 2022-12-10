
package vendaprodutos;

public class Vendaprodutos {

    public static void main(String[] args) {
  
        double descontar1, total, p, pre, q;
        
        
        desconto des = new desconto();
        
        produtos pro = new produtos();
                       
        descontar1 = des.getdescontar();
        
        des.setentradas(22, "sabado");
        
        pro.setvender(88888, 10, 10, des);
        
        total = pro.gettotal();
        
        p = pro.getproduto();
        
        pre = pro.getpreco();
        
        q = pro.getquantidade();
                
        
        
        
    System.out.println("  produto  " + p);
    System.out.println("  preco  " + pre);
    System.out.println("  quantidade  " + q);
    System.out.println("  valor total  " + total);
   
        
      des.impressao();
        
        
    }
    
}
