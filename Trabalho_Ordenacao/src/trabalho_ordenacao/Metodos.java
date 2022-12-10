
package trabalho_ordenacao;


public class Metodos {
    
    public int contador;
    
    private int contadors;
    
    private int contadori;
    
    private int contadorb;
    
    
    
  
    
    
    public int[] vetc (int x){
    
     
        
    int vet[] = new int [x]; 
    
    for (int i = 0;  i<vet.length; i ++){
        
          vet[i] = i;
    
    }
    
    
    
    return vet;
}
    
    
     public int[] vetd (int x){
    
    
        
    int vet1[] = new int [x]; 
    
    for (int i = 0;  i< vet1.length; i ++){
        
          vet1[i] = (vet1.length - 1) -i;
    
    }
    
  
    return vet1;
    
    
}
 
   public int[] veta (int x){
    
    
        
    int vet2[] = new int [x]; 
    
    for (int i = 0;  i<vet2.length; i ++){
        
          vet2[i] = (int) (Math.random() * x);
    
    }
    
    
    return vet2;   
     
}

public  int selectionSort(int[] v){
    
         int i, j, minIndex, temp;
         
         contadors = 0;
        
         for (i = 0; i < v.length; i++)
         {
             minIndex = i;
           
             for (j = i+1; j < v.length; j++){
               
                 contadors++;
                 if (v[j] < v[minIndex])
                    minIndex = j;
             }
            
             if (minIndex != i)
             {
                   temp = v[i];
                   v[i] = v[minIndex];
                   v[minIndex] = v[temp];
                   
             }
         }  
       
       
        
        
        
        return(contadors);
}




 public  int insertionSort(int [] v){  
 
     contadori = 0;
     
     
     int i, j, temp ;
     
     for (i=1; i < v.length; i++)
     {
        
         temp = v[i];
         j = i - 1;
         if(j>=0)
         contadori++;    
         while (j >= 0 && v[j] > temp)
            
         {
              
             v[j+1] = v[j];
             j--;
             if(j>=0)
             contadori++; 
         }
         
         
         if(temp != v[j+1]){
             v[j+1] = temp;
         
        
         }
     }

 
    return(contadori);
}
 
 
 
 
  public  int bubbleinsertionSort(int v[]){  
 
     contadorb = 0;
     
     
     int passo,i, j, temp ;
     
     for (passo=1; passo < v.length; passo++)
     {
        
         for (j = 0; j <v.length - passo; j++){
             
             contadorb++;   
             
             if(v[j] > v[j+1]){
                temp = v[j+1];
                v[j+1] = v[j];
                v[j] = (temp); 
               
             }    
        }
  
     }     
         
     
       
         return(contadorb);
}
  

   
  
  public  int QuickSort(int []v , int lo, int hi){
     

      
// lo é o índice mais baixo, hi é o índice mais alto
// da região do vetor que irá ser ordenada
   int i=lo, j=hi, h;
   int x = ((lo+hi)/2);
   // particionamento
   
   do {
       contador++;
       while (v[i]< v[x]) 
       { i++;
             contador++;}
       contador++;
       while (v[j] > v[x]) 
       {j--;
             contador++;}
        
       if (i<=j) 
       {
          h= v[i]; 
          v[i] = v[j]; 
          v[j] = h; 
          i++; 
          j--;
          
       }
   } while (i<=j);
   // recursão
   if (lo<j) 
      QuickSort(v,lo,j);
   if (i<hi) 
      QuickSort(v, i, hi);

      
      return(contador);
   
  }     
   
 

  
  
}  
  

    
     
     
