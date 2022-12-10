public class Questao1 {

    public static void main(String[] args) {
       
    int contador,total,soma;    
    contador = 1
    soma = 0        
    while (contador<=10){        
           total = (contador%2);
           if (total==0){
              System.out.println("os numeros pares sao " + contador);
              soma = (soma+contador)
                      }
            contador++       
             
        }
    System.out.println("o valor total dos numeros pares é" + soma);
 }
}