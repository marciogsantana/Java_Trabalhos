
public class Guesgame {

    Player p1;
    
    Player p2;
    
    Player p3;
    
    public void startgame(){
        
        p1 = new Player();
        
        p2 = new Player();
        
        p3 = new Player();
        
        int guessp1 = 0;
        
        int guessp2 = 0;
        
        int guessp3 = 0;
        
        
        boolean p1lisRight = false; 
        
        boolean p2lisRight = false; 
        
        boolean p3lisRight = false;
        
        
        int targetnumber = (int) (Math.random() * 10);
        
        System.out.println (" estou pensando em um numero entre 0 ....9 ");
        
        while (true) {
        
        
        System.out.println (" o numero a adivinhar  é " + targetnumber);
        
        p1.Guess();
        
        p2.Guess();
        
        p3.Guess();
        
        guessp1 = p1.number;
        
        System.out.println(" o jogador um forneceu o palpite " + guessp1);

        guessp2 = p2.number;
        
        System.out.println(" o jogador dois forneceu o palpite " + guessp2);
    
        guessp3 = p3.number;
        
        System.out.println(" o jogador tres forneceu o palpite " + guessp3);
    
    
        if (guessp1 == targetnumber) {
    
            p1lisRight = true;
        } 
    
        if (guessp2 == targetnumber) {
    
            p2lisRight = true;
    
        }
    
        if (guessp3 == targetnumber) {
    
            p3lisRight = true;
    
        }
    
        
        if (p1lisRight || p2lisRight || p3lisRight){
            
            System.out.println("temos um vencedor");
            
            System.out.println("o jodador um acertou ? " + p1lisRight);
            
            System.out.println("o jodador dois acertou ? " + p2lisRight);
            
            System.out.println("o jodador tres acertou ? " + p3lisRight);
            
            System.out.println(" fim de jogo ");
        
            break;
            
        } else{
        
           System.out.println("os jogadores terão que tentar novamente ");
        
        } 
    
    }    
    }
        
        
        
        
}
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

