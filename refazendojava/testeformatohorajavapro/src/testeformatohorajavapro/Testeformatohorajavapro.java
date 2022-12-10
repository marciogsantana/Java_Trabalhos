
package testeformatohorajavapro;

public class Testeformatohorajavapro {

    public static void main(String[] args) {
        
        
        hora horachegada = new hora(8, 1, 1);
        hora horasaida = new hora(19, 30, 1);
        funcionario geddyLee = new funcionario("Geddy Lee", horachegada, horasaida);
        
        System.out.println("Hora de chegada: " + horachegada);
        System.out.println("Hora de saída: " + horasaida);
        System.out.printf("Horas trabalhadas: %.1f\n",geddyLee.getHorasTrabalhadas());
        
        
        
        
        
        
        
        
        
    }
    
}
