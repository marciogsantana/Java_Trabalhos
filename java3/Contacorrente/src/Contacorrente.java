public class Contacorrente {

    public static void main(String[] args) {
   
        Conta minhaconta;
        
        minhaconta = new Conta();
        
        minhaconta.iniciarconta(1232, 1455);
        
        minhaconta.depositar(50);
        
        minhaconta.sacar(30);
        
        System.out.println("saldo" + minhaconta.consultarsaldo());
        
        
         
    }
    
}
