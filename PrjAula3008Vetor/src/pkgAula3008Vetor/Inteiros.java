/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgAula3008Vetor;

import javax.swing.DefaultListModel;

/**
 *
 * @author alexandresd
 */
public class Inteiros {
    public static int somaLista(DefaultListModel listModel)
    {
        int s = 0;
        
        for (int i = 0; i < listModel.getSize(); i++)
        {
            s = s + (Integer)listModel.get(i);
        }
        
        return s;
    }
    
    
    public static boolean verificapar (int x){
        
        int par = x%2;
        
        if (par == 0)
            
            return(true);
        
        else
        
            return(false);
        
    }
    
    public static int verificavetor(int parametro,DefaultListModel listModel){
       
       int teste = parametro;
       
       int soma = 0;
       
       for (int cont1 = 0; cont1 <listModel.getSize(); cont1++){
       
          int s1 = (Integer)listModel.get(cont1);
           
       if  (s1 == parametro)
       
            soma = soma + 1;
           
           
   } 
    
    return(soma);
}
    
    public static int media (DefaultListModel listModel){
       
       int media = Inteiros.somaLista(listModel) /listModel.size();
       
       return media;
   }
    public static int [] comparacao (DefaultListModel listModel){
   
       int maior = 0;
       
       int menor = (Integer)listModel.get(0);
       
       int s;
       
   for (int cont3 = 0; cont3 <listModel.getSize(); cont3++){
       
       s = (Integer)listModel.get(cont3);
   
       if (s > maior)
       
           maior = s;
       
       else if (s < menor)
                                
           menor = s;
 }
   
   int compara[] = new int[2];
        
        compara[0] = menor;
        compara[1] = maior;
   
        return compara;
   }
    
     public static int[] somavetores(int vetor5[], int vetor6[]){
       
       int vetorsoma[] = new int [vetor5.length];
       
       for (int v = 0; v < vetor5.length; v++){
           
           vetorsoma[v] = vetor5[v] + vetor6[v];
           
       }    
         return vetorsoma; 
       
       }
}
