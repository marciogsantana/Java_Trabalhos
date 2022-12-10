
package trabalho_pesquisa;

import javax.swing.DefaultListModel;


public class Lista {
    
    
    
    
    public int pesquisa(DefaultListModel listModel1, int chave){
        
        
        for (int i = 0; i <listModel1.getSize(); i++){
            
              int compara = (Integer)listModel1.get(i);
            
               if (compara == chave)
                   
                   return i;
              
              
        }
        
            return -1;    
        
    }
    
    public int pesquisabinaria(DefaultListModel listModel1, int chave){
        
        int inf = 0;
        int sup = listModel1.getSize() - 1;
        int meio;
        
        while (inf <=sup){
            
            meio = (inf + sup) / 2;
            
            if (chave == (Integer)listModel1.get(meio))
                
                return meio;
            
            else if (chave < (Integer)listModel1.get(meio))
                
                sup = meio - 1;
            
            else
                
                inf = meio + 1; 
        
        }    
            
            return -1;
        
        }
        
    public  void insertionSort(DefaultListModel listModel1,DefaultListModel listModel){  
 
     
     
     int i, j, temp, contador ;
     
     String temp1;
     
     contador = 0;
     
     for (i=1; i < listModel1.getSize(); i++)
     {
        
         temp = (Integer)listModel1.get(i);
         temp1 = (String) listModel.get(i);
         j = i - 1;
         if(j>=0)
         contador++;   
         while (j >= 0 && (Integer)listModel1.get(j) > temp){
            
         
              
                   listModel1.set(j+1, (Integer)listModel1.get(j));
                   listModel.set(j+1, (String)listModel.get(j));
                   j--;
                   if(j>=0)
                   contador++;      
        }     
         
         
            if(temp != (Integer)listModel1.get(j+1)){
            listModel1.set(j+1, (temp));
            listModel.set(j+1, (temp1)); 
         
         }
     
}
     
    }
    
}    
     
     

 
        
        
        
    
    
    

