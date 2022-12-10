
public class Ccc {

    public static void main(String[] args) {
   
        TESTE minhaconta = new TESTE();
        
                
        minhaconta.iniciarconta(1232, 1455);
        
        minhaconta.depositar(50);
        
        minhaconta.sacar(30);
        
        System.out.println("saldo" + minhaconta.consultarsaldo());
        
        
         
    }
    
}