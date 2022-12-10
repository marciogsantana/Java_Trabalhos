
package projetosalaanalisealgoritimo1;

import javax.swing.DefaultListModel;


/**
 *
 * @author Marcio Gomes
 */
public class Telaprincipal {
    
public static int [] Max1 (DefaultListModel listModel){
   
       int maior = (Integer)listModel.get(0);
       
       int menor = (Integer)listModel.get(0);
       
       int contador =  0;
              
   for (int cont3 = 1; cont3 <listModel.getSize(); cont3++){
       
       
   
       if ((Integer)listModel.get(cont3) > maior)
       
           maior = (Integer)listModel.get(cont3);
        
           contador++;
          
       if ((Integer)listModel.get(cont3) < menor)
 
            menor = (Integer)listModel.get(cont3);
   
            contador++;
            
             
   }   
       
        int compara[] = new int[3];
        
        compara[0] = maior;
        compara[1] = menor;
        compara[2] = contador;
   
        return compara;
   }
    
     public static int [] Max2 (DefaultListModel listModel){
   
       int maior = (Integer)listModel.get(0);
       
       int menor = (Integer)listModel.get(0);
       
       int contador =  0;
              
   for (int cont3 = 1; cont3 <listModel.getSize(); cont3++){
       
       
   
       if ((Integer)listModel.get(cont3) > maior){
       
           maior = (Integer)listModel.get(cont3);
        
           contador++;
          }
       else {
           contador++;
           
           if ((Integer)listModel.get(cont3) < menor){
            
           contador++;    
               
            menor = (Integer)listModel.get(cont3);
   
            
            
       }      
   }   
      
   }    
        int compara[] = new int[3];
        
        compara[0] = maior;
        compara[1] = menor;
        compara[2] = contador;
   
        return compara;
   }
    
     public static int [] Max3 (DefaultListModel listModel){
         
          int maior;
          
          int menor;
          
          int contador = 0;
     
          contador++;
          
         if ((Integer)listModel.get(0) > (Integer)listModel.get(1)){
          
                 
                maior = (Integer)listModel.get(0);
       
                menor = (Integer)listModel.get(1);
       
        } 
   
         else{
                 
                maior = (Integer)listModel.get(1);
       
                menor = (Integer)listModel.get(0);
                 
        } 
         
         int i = 2;
        
         
     while (i < listModel.getSize() ){
         
         contador++;
         
         if ((Integer)listModel.get(i) > (Integer)listModel.get(i+1)){
         
             contador = contador +2;
             
             if ((Integer)listModel.get(i) > maior)
             
                 maior = (Integer)listModel.get(i);
                 
             if ((Integer)listModel.get(i+1) < menor)
             
                 menor = (Integer)listModel.get(i + 1);
                 
        }         
                     
         else {
                 
             contador = contador +2;
             
               if ((Integer)listModel.get(i) < menor)
               
               
                   
               menor = (Integer)listModel.get(i);
         
               if ((Integer)listModel.get(i+1) > maior)
             
                 maior = (Integer)listModel.get(i+1);
                 
             }     
                     
        i = i + 2;
             
                 
    }
     
     
      int compara[] = new int[3];
        
        compara[0] = maior;
        compara[1] = menor;
        compara[2] = contador;
        return compara;
}
     
}     
         
 
         
         
       
       
   
   

