
import java.util.ArrayList;
import java.util.Scanner;

public class ControlRondes{

    static Scanner input = new Scanner (System.in);
    int ronda = 1;
    static int tornActual = 0;
    static int iTotal = 0;
    String pausa;
    static int i = 0;
    static int rondaActual = 0;

    public static ArrayList guardarNoms(int nombreJugadors, ArrayList llistaNoms){
        for (int i = 0; i < nombreJugadors; i++){
            System.out.printf("Nom del jugador numero %d:" , i + 1 );
            llistaNoms.add(input.nextLine());
        }
        return(llistaNoms);
    }

    public static String comptadorTorn(int nombreJugadors, ArrayList llistaNoms){
        tornActual = i % nombreJugadors;
        i++;
        String nomTorn = llistaNoms.get(tornActual).toString();
        return nomTorn;
    }

    public static void comptadorRondes (int rondaLimit, int ronda){
        if(ronda < rondaLimit){
            System.out.println("Ronda: " + (ronda + 1));
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ControlRondes{

    static Scanner input = new Scanner (System.in);
    int ronda = 1;
    static int tornActual = 0;
    static int iTotal = 0;
    String pausa;
    static int i = 0;
    static int rondaActual = 0;

    public static ArrayList guardarNoms(int nombreJugadors, ArrayList llistaNoms){
        for (int i = 0; i < nombreJugadors; i++){
            System.out.printf("Nom del jugador numero %d:" , i + 1 );
            llistaNoms.add(input.nextLine());
        }
        return(llistaNoms);
    }

    public static String comptadorTorn(int nombreJugadors, ArrayList llistaNoms){
        tornActual = i % nombreJugadors;
        i++;
        String nomTorn = llistaNoms.get(tornActual).toString();
        return nomTorn;
    }


    public static void comptadorRondes (int rondaLimit, int ronda){
        if(ronda < rondaLimit){
            System.out.println("Ronda: " + (ronda + 1));
        }
    }
}
