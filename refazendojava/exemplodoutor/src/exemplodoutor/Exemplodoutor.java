
package exemplodoutor;





public class Exemplodoutor {

    
    public static void main(String[] args) {
    
        
         
        
        
        jogarrr teste1 = new jogarrr();
        
        
        teste1.fazer();
        teste1.conselho();
        teste1.tata();
        teste1.pular();
        
        int ferrari;
        
        
        ferrari = teste1.retorna(10);
        
        System.out.println("valor do retorno é" + ferrari);
       
        sugestao teste2 = new sugestao();
        
        teste2.fazer();
        teste2.inserir();
        teste2.pular();
        
        doctor [] doutores = new doctor[3];
        
        doutores [0] = new familia();
        doutores [1] = new sugestao();
        doutores [2] = new jogarrr();
        
        for (int i = 0; i < 3; i++){
            
            doutores [i].fazer();
            
            System.out.println(  doutores [i].retorna(10));
            
            System.out.println(" todos pulando kkkkkkkkkkkk");
            
            doutores[i].pular();
            
        } 
        
        
        System.out.println("novo teste argumento");
        
        vet v = new vet();
        
        v.giveshot(teste2);
        
        v.giveshot(teste1);
        
        familia teste3 = new familia();
        
        marccio b = new marccio();
        
             
        
        nadar t = new nadar();
        
        t.nadando(teste2);
        t.nadando(teste1);
        t.nadando(teste3);
        t.nadando(b);
        
 
        b.fazer();
        b.conselho();
        b.pular();
        b.voar();
        
        doctor teste10 = new familia();
        
        
        teste10.fazer();
        teste10.pular();
     
        familia teste11 = new familia();
        
        
    System.out.println(" exemlos capitulo 8");
        
    // começa aqui exemplos capitulo 8
    
    myanimallist list =new  myanimallist(); 
    
     familia a = new familia();
     jogarrr c = new jogarrr();

     list.add(a);
     list.add(b);
     
     // extensao nova super classe
     
     
     System.out.println(" testando nova suprclasse");
     
     pet andarilho = new pet();
     
     andarilho.jantar();
     andarilho.caminhar();
     andarilho.tata();
     andarilho.pular();
     
     robodog bob = new robodog();
     
     
     bob.caminhar();
     bob.jantar();
     bob.fazer();
     bob.inserir();
             
     
     
     
    }
    
}
