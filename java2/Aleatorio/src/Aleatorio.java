import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {

        // Passo 1: preparando o gerador
        Random randomGenerator = new Random();
        
        // Passo 2: gerando 20 números
        for(int count=1 ; count <= 20 ; count++){
        
        // Passo 3: gerando um número entre 1000 e 1999
            int num_aleatorio = randomGenerator.nextInt(1000) + 1000;
            
        // Passo 4: imprimindo somente os que deixam resto 5 na divisão por 11
            if(num_aleatorio % 11 == 5)
                System.out.println(num_aleatorio);
        }
    }

}