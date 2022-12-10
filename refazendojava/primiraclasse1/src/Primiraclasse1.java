
import java.util.Scanner;

 class alunos {
    
    public String alunos;
   
    public double notmatem;
    
    public double notfisica;
    
    
    public alunos(){
        
        alunos = alunos;
        
        notmatem = notmatem;
        
        notfisica = notfisica;
        
    }
    
    
  
    public void setacertar(double fisica, double matematica, String tata){
    
       notfisica = fisica;
      
       notmatem = matematica;  
       
       alunos = tata;
    }    

 
    public double gettotal (){ 
 
       double total1;
       
       total1 = (notfisica + notmatem)/2;
 
       return total1;
    }
    
 }   
public class Primiraclasse1 {

    
    
  
   
    public static void main(String[] args) { 
        
       
    
       Scanner entrada = new Scanner(System.in);
        
        alunos marcio = new alunos();
         
        
        
        System.out.println("informe o aluno");
        
        String tete = entrada.nextLine();
        
        
       
        System.out.println("informe a nota de matemativa");
       
        double matematica1 = entrada.nextDouble();
       
         System.out.println("informe a nota de fisica");
        
        double fisica1 = entrada.nextDouble();
        
        marcio.setacertar(matematica1, fisica1, tete);
        
        double v = marcio.gettotal();
        
        
        System.out.println(" os alunos sao " + marcio.alunos  + " "+ marcio.notfisica +" " + marcio.notmatem);
        System.out.println(" a media é " + v);
         
}    
    
}
