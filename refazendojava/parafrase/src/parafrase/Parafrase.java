
package parafrase;


public class Parafrase {

  
    public static void main(String[] args) {

        
        String[] lista1 = {"24/7", "varias camadas", "30.000 pes", "b-to-b", "todos ganham", "front end", "baseado na web", "difundido", "inteligente", "seias", "sigma", "caminho critico", "dinamico"};
     
        String[] lista2 = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuido", "agrupado"};
        
        String [] lista3 = {"processo", "ponto", "maximo"};
        
        
        int num1 = lista1.length;
        
        int num2 = lista2.length;
        
        int num3 = lista3.length;
        
        System.out.println(" valor do vetor1 é " + num1);
        
        System.out.println(" valor do vetor2 é " + num2);
        
        System.out.println(" valor do vetor3 é " + num3);
        
        
        int rand1 = (int) (Math.random() * num1);
        
        int rand2 = (int) (Math.random() * num2);
        
        int rand3 = (int) (Math.random() * num3);
        
        String resultado = lista1[rand1] + " " + lista2[rand2] + " " + lista3[rand3];
        
        
        System.out.println (" o resultado é " + resultado);
        
    }
    
}
