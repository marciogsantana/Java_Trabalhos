public class Parar {
    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        boolean imprimir = true;
        
        for(int count=1 ; count <=1000000 ; count++){
            if((count % 17 == 0) && (count % 19 == 0))
                if(imprimir){
                    System.out.println(count);
                    imprimir=false;
                }
        }

        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() -i));
    }

}