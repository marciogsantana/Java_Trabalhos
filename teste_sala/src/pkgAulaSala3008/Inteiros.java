/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgAulaSala3008;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Professor
 */
public class Inteiros {

    public static int[] maxMin2(
        DefaultListModel lista)
    { 
        int comp = 0;
         int max = (Integer)lista.get(0); 
         int min = (Integer)lista.get(0); 
         for (int i = 1; i < lista.getSize(); i++)
         {
             comp++;
             if ((Integer)lista.get(i) > max) 
               max = (Integer)lista.get(i);
            else {
                comp++;
                if ((Integer)lista.get(i) < min){
                    min = (Integer)lista.get(i);
                }
            }
         }
         
         int resultado[] = {min, max, comp};
         return resultado;
    }
    
    public static int[] maior(DefaultListModel 
            lista)
    {
        int m = (Integer)lista.get(0);
        int cont = 0;
        
        for (int i = 1; i < lista.getSize(); i++)
        {
            cont++;
            if ((Integer)lista.get(i) > m)
            {
                m = (Integer)lista.get(i);
            }
        }
        int res[] = {m, cont};
        return res;
    }
    static int PesquisaBinaria(DefaultListModel 
            lista, JList jList, int valor)
    {
         int inf = 0; 
         int sup = lista.getSize()-1; 
         int meio;
         while (inf <= sup) 
         {
            meio = (inf+sup)/2;
            jList.setSelectedIndex(meio);
            jList.update(jList.getGraphics());
            try { 
               Thread.sleep(2500); 
            } catch (InterruptedException ex) {
               System.out.println ("Puxa, estava dormindo! Você me acordou");
            }             
            jList.setSelectedIndex(-1);

              if (valor == (Integer)lista.get(meio))
                   return meio;
              else if (valor < (Integer)lista.get(meio))
                   sup = meio-1;
              else
                   inf = meio+1;
         }
         return -1;   
    }
    
    static void selectionSort(DefaultListModel 
            lista, JList jList)
    {
         int i, j, minIndex, temp;

         for (i = 0; i < lista.getSize(); i++)
         {
             minIndex = i;
             for (j = i+1; j < lista.getSize(); j++)
             {
                 if ((Integer)lista.get(j) < (Integer)lista.get(minIndex))
                    minIndex = j;
             }
             jList.update(jList.getGraphics());
             try { 
                Thread.sleep(2500); 
            } catch (InterruptedException ex) {
                System.out.println ("Puxa, estava dormindo! Você me acordou");
            }             
             if (minIndex != i)
             {
                   temp = (Integer)lista.get(i);
                   lista.set(i, (Integer)lista.get(minIndex));
                   lista.set(minIndex, temp);
             }
         }  
}
    
}
