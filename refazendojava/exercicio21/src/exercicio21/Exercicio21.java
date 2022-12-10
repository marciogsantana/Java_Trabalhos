
package exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    
    public static void mediano(int... notas){
        
        int media = 0;
        
        for (int i : notas ){
            
            media = media + i;
            
          }
        
        int resumo;
        
        resumo = media/notas.length;
        
        System.out.println(" a media é " + resumo);
        
        
    }
    
    
    public static void maiornota(int... notas){
        
              int maior = 0;
              
              int maiornota = 0;
        
             for (int i : notas){
                 
                 maior = i;
                 
                 if (maior > maiornota){
                     
                     maiornota = maior;
                 }
                 
             }     
              
             System.out.println(" a maior nota é " + maiornota);
                 
             }
        
            public static void menornota(int... notas){
        
              int menor = 0;
              
              int menornota = 100000000;
        
             for (int i : notas){
                 
                 menor = i;
                 
                 if (menor < menornota){
                     
                     menornota = menor;
                 }
                 
             }     
              
             System.out.println(" a maior nota é " + menornota);
                 
             }      
    
    
    
    
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        int valor1,valor2,valor3;
        
        System.out.println("iforme a primeira nota");
        
            valor1 = entrada.nextInt();
        
        System.out.println("iforme a segunda nota");
        
            valor2 = entrada.nextInt();    
             
        System.out.println("iforme a terceira nota");
        
            valor3 = entrada.nextInt();
            
            
            int maior1, menor1;
            
            maior1 = 0;
            menor1 = 0;
            
            if (valor1 > maior1){
                
                maior1 = valor1;
                
            }    
                
            if (valor2 > maior1){
        
                     menor1 = maior1;
                     maior1 = valor2;
        
            }
                
            if (valor3 > maior1){
                
                menor1 = maior1;
                maior1 = valor3;         
                
                
            }
            
            
            
            
            mediano(valor1,valor2,valor3);
            maiornota(valor1,valor2,valor3);
            menornota(valor1,valor2,valor3);
            mediano(maior1,menor1);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
    
}
