
package projetomarcioaviao;


import java.util.ArrayList;

public class lista {
    
       
   ArrayList<aviao> listaaviao = new ArrayList<>(); 
    
 public void adicionarlista(){   
   
        
     aviao aviao1 = new aviao();
     aviao aviao2 = new aviao();
     aviao aviao3 = new aviao();
     
     listaaviao.add(aviao1);
     listaaviao.add(aviao2);
     listaaviao.add(aviao3);
 }
 
 public void elementos(){
     
     for (aviao nome : listaaviao){
         
         System.out.println(nome);
         
         
     }
       
     
     
 }
 
 public void numerolista(){
     
     System.out.println("o numero de elementos" + listaaviao.size());
     
     
 }
 
 
 public void saidaaviao(){
     
    listaaviao.remove(0);
    
    System.out.println(" aviao decolou");
     
 }     
     
public void listagem(){
    
}     
     
 }
     
     
 
 
 
 
 
 
 

 
 

