
public class fazerjogo {

    jogar p1 = new jogar();
    jogar p2 = new jogar();
    jogar p3 = new jogar();
    
    public void iniciojogo(){
    
       
       
       int guessp1 = 0;
       int guessp2 = 0;
       int guessp3 = 0;
    
       boolean plista1 = false;
       boolean plista2 = false;
       boolean plista3 = false;
    
       int tarja = (int) (Math.random() * 10);
       
       System.out.println("estou pensando em um numero entre 0 e 9 .....");
    
    
         while(true){
             
             System.out.println("o numero a adivinhar é " + tarja);
             
             p1.guess();
             p2.guess(); 
             p3.guess();
             
             System.out.println("testando" + p1.numero + "      " + p2.numero);            
             
             
             guessp1 = p1.numero;
             
             System.out.println(" o jogador um forneneu o palpite " + guessp1);
             
             guessp2 = p2.numero;
             
             System.out.println(" o jogador dois forneneu o palpite " + guessp2);
             
             guessp3 = p3.numero;
             
             System.out.println(" o jogador tres forneneu o palpite " + guessp3);
             
             if (guessp1 == tarja){
                 
                 plista1 = true;
             }
             
             if (guessp2 == tarja){
                 
                 plista2 = true;
             }
             
             if (guessp3 == tarja){
                 
                 plista3 = true;
             }
             
         
             if (plista1 || plista2 || plista3) {
             
                 System.out.println("temos um vencedor");
                 System.out.println("o jogador um acertou ? " + plista1);
                 System.out.println("o jogador dois acertou ? " + plista2);
                 System.out.println("o jogador tres acertou ? " + plista3);
                 System.out.println("fim do jogo");
                 break;
             }
        
             else {
                   System.out.println("os jogadores terao que continuar ");
                 
             }
             
   }
}
} 
