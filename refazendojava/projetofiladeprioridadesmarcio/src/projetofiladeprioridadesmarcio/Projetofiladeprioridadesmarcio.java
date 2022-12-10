
package projetofiladeprioridadesmarcio;

import java.util.Scanner;
import java.util.ArrayList;

public class Projetofiladeprioridadesmarcio {

   
   
    public static void main(String[] args) {
    
         ArrayList<String> lista1 = new ArrayList<String>();
        
        lista1.add("marcio");
        lista1.add("juliane");
        
        ArrayList<String> lista2 = new ArrayList<String>();
        
       lista2.add("laura");
       lista2.add("luiza");
        
       
       ArrayList<String> lista3 = new ArrayList<String>();
        
       lista3.add("mariluce");
       lista3.add("marciene");
       lista3.add("marcelo");
       lista3.add("marly");
       
       int numero1 = 0;
       int controle = 0;
       int numero = 0;
       int contador = 0;
       int cont = 0;
       
       
       do{
       
        if (lista1.size() > 0 ){
           
           System.out.println(" pessoas da lista prioritaria " + (lista1));
           System.out.println("o atendimento sera feito para "+ lista1.get(0));
           lista1.remove(0);
           System.out.println(" pessoas da lista prioritaria " + (lista1)); 
           
        }
        
            
       
        if (lista1.size() <=0 && lista2.size() > 0 && cont < 1){
           
            System.out.println(" pessoas da lista emergencia " + (lista2));
            System.out.println("o atendimento sera feito para "+ lista2.get(0));
            lista2.remove(0);
            System.out.println(" pessoas da lista emergencia " + (lista2));    
            cont++;   
           
        }
           
        if(contador < 2 && lista1.size() == 0 && cont >= 1 && numero < 2){ 
                
            System.out.println(" pessoas da lista normal" + (lista3));
            System.out.println("o atendimento sera feito para "+ lista3.get(0));    
            lista3.remove(0);
            System.out.println(" pessoas da lista normal " + (lista3));    
            numero1++;
            contador++;
            if (numero1 == 2){    
                
                cont = 0;
                numero1 = 0;
                contador = 0;
                
            }
         
            
           
    }   
       
        if(lista1.size() == 0 && lista2.size() == 0 && lista3.size() == 0){
            
             System.out.println("nçao existem pessoas para serem atendidadas");
              controle = 0;
        }
          
           
           
       
        System.out.println(" deseja continuar informe o numero 1");
        
        Scanner entrada = new Scanner(System.in);
        
        int teste = entrada.nextInt();
          
            if (teste == 1){
                
                controle = 1;
                
            } 
            else {
                
                controle = 0;
                
            }
            
            
       }while(controle != 0);
     
       System.out.println("fim do programa");
       
    }     
         
      
    }
    

       