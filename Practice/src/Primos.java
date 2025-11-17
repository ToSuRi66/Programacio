public class Primos {
    public static void main (String[]args) {

        int numero = 25;
        //Saber primos
    }

    public String descFactorial(int numero){
        String llistaFinal = "";
        for (int i = 0; i < numero; i++) {
            
        }
        return llistaFinal;
    }

    public static boolean esPrimer(int numeroP){

        boolean result = true;
        for (int i = 2; i < numeroP; i++) {
            if ( numeroP % i == 0) result = false;
        }
        return result;
    }

}