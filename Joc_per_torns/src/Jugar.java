import java.util.ArrayList;
import java.util.Scanner;

public class Jugar {

    static Scanner input = new Scanner (System.in);
    static boolean jocAcabat = false;
    static String pause = input.nextLine();
    static int rondaActual = 0;

    public static void jugar(int nombreJugadors, int rondaLimit, ArrayList llistaNoms){
        do{
            for (int ronda = 0; ronda < rondaLimit;ronda++){
                ControlRondes.comptadorRondes(rondaLimit,ronda);
                for(int j = 0; j < nombreJugadors;j++){
                    String tornActual = ControlRondes.comptadorTorn(nombreJugadors,llistaNoms);
                    System.out.printf("Es el torn de: %S", tornActual);
                    pause = input.nextLine();
                    // EntradaSortida.pausa();
                }
                pause = input.nextLine();
            }
            jocAcabat = true;
        } while (jocAcabat == false);
    }
}
