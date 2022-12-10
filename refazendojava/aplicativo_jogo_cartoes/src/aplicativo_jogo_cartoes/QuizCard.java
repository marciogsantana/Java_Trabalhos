
package aplicativo_jogo_cartoes;

public class QuizCard {
    
    private String questtion;
    
    private String answer;
    
    public QuizCard(String q, String a){
        
        this.questtion = q;
        
        this.answer = a;
        
    }
    
    public String getquestion(){
        
        return(this.questtion);
        
    }
    
    
    public String getanswer(){
        
        return(this.answer);
    }
    
    
}
