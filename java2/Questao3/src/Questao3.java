blic class Questao3 {

    public static void main(String[] args) {
       
    int contador,total,soma,soma1;    
    contador = 1
    soma = 0
    soma1 = 0        
    while (contador<=10){        
           total = (contador%2);
           if (total==0){
              System.out.println("os numeros pares sao " + contador);
              soma = (soma+contador);
                      }
           else {
               System.out.println("os numeros impares sao " + contador)
               soma1 = (soma1+contador);  
               
                }
            contador++       
             
        }
    System.out.println("o valor total dos numeros pares é" + soma);
    System.out.println("o valor total dos numeros impares é" + soma1);
 }
}
