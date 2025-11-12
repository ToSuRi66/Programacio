import java.util.Scanner;

public class ComptadorCircular {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        int nombreJugadors;
        int tornActual = 0;
        int ronda = 1;
        int rondaLim = 0;
        String pausa;
        int iTotal = 0;

        System.out.printf("Cuants de jugadors 1-5: ");
        nombreJugadors = input.nextInt();
        System.out.printf("Cuantes rondes voleu jugar?");
        rondaLim = input.nextInt();
        System.out.printf("Començam?\n\n");
        pausa = input.nextLine();//Arrancar pausa
        iTotal = rondaLim * nombreJugadors;


        for (int i = 0; i < iTotal; i++) {
            tornActual = i % nombreJugadors;

            if (tornActual == 0) {
                System.out.println("Ronda " + ronda++);
                System.out.printf("Es el torn del jugador: %d\n" , (tornActual + 1));
                pausa = input.nextLine();
            }

            if (tornActual > 0 && tornActual <= nombreJugadors) {
                System.out.printf("Es el torn del jugador: %d\n" , (tornActual + 1));
                pausa = input.nextLine();
            }
        }
        System.out.println("Partida finalitzada, enhorabona al guanyador");
    }
}
