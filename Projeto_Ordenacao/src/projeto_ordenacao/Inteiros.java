
package projeto_ordenacao;

import javax.swing.DefaultListModel;
import javax.swing.JList;


public class Inteiros {
    
private int contador;    
private int contadortrocas;    

   public  void selectionSort(DefaultListModel lista, JList jList){
    
         int i, j, minIndex, temp;
         
         contador = 0;
         contadortrocas = 0;

         for (i = 0; i < lista.getSize(); i++)
         {
             minIndex = i;
           
             for (j = i+1; j < lista.getSize(); j++){
               
                 contador++;
                 if ((Integer)lista.get(j) < (Integer)lista.get(minIndex))
                    minIndex = j;
             }
             jList.update(jList.getGraphics());
             try { 
                Thread.sleep(1000); 
            } catch (InterruptedException ex) {
                System.out.println ("Erro na contagem");
            }             
             if (minIndex != i)
             {
                   temp = (Integer)lista.get(i);
                   lista.set(i, (Integer)lista.get(minIndex));
                   lista.set(minIndex, temp);
                   contadortrocas++;
             }
         }  
    
    
}

  public int getcontador(){
      
      return(contador);
      
  }
  
   public int getcontadortrocas(){
      
      return(contadortrocas);
      
  }
  
 public  void insertionSort(DefaultListModel lista, JList jList){  
 
     contador = 0;
     contadortrocas = 0;
     
     int i, j, temp ;
     
     for (i=1; i < lista.getSize(); i++)
     {
        
         temp = (Integer)lista.get(i);
         j = i - 1;
         if(j>=0)
         contador++;    
         while (j >= 0 && (Integer)lista.get(j) > temp)
            
         {
              
             lista.set(j+1, (Integer)lista.get(j));
             j--;
             if(j>=0)
             contador++; 
         }
         jList.update(jList.getGraphics());
             try { 
                Thread.sleep(1000); 
            } catch (InterruptedException ex) {
                System.out.println ("erro na contagem");
            }             
         if(temp != (Integer)lista.get(j+1)){
             lista.set(j+1, (temp));
         
         contadortrocas++;
         }
     }
}

 public  void bubbleinsertionSort(DefaultListModel lista, JList jList){  
 
     contador = 0;
     contadortrocas = 0;
     
     int passo,i, j, temp ;
     
     for (passo=1; passo < lista.getSize(); passo++)
     {
        
         for (j = 0; j <lista.getSize()- passo; j++){
             
             contador++;   
              jList.update(jList.getGraphics());
             try { 
                Thread.sleep(1000); 
            } catch (InterruptedException ex) {
                System.out.println ("erro na contagem");
            }             
             if((Integer)lista.get(j) > (Integer)lista.get(j+1)){
                temp = (Integer)lista.get(j+1);
                lista.set(j+1, ((Integer)lista.get(j)));
                lista.set(j, (temp)); 
                contadortrocas++;
             }    
        }
  
     }     
     
 }
  public  void QuickSort(DefaultListModel lista, JList jList, int lo, int hi){
     

      
// lo é o índice mais baixo, hi é o índice mais alto
// da região do vetor que irá ser ordenada
   int i=lo, j=hi, h;
   int x = ((lo+hi)/2);
   // particionamento
   
   do {
       contador++;
       while ((Integer)lista.get(i)< (Integer)lista.get(x)) 
       { i++;
             contador++;}
       contador++;
       while ((Integer)lista.get(j)>(Integer)lista.get(x)) 
       {j--;
             contador++;}
        jList.update(jList.getGraphics());
             try { 
                Thread.sleep(2500); 
            } catch (InterruptedException ex) {
                System.out.println ("erro na contagem");
            }                  
       if (i<=j) 
       {
          h=(Integer)lista.get(i); 
          lista.set(i, ((Integer)lista.get(j))); 
          lista.set(j, h); 
          i++; 
          j--;
          contadortrocas++;
       }
   } while (i<=j);
   // recursão
   if (lo<j) 
      QuickSort(lista,jList,lo,j);
   if (i<hi) 
      QuickSort(lista,jList, i, hi);
}

      
      
  }  
