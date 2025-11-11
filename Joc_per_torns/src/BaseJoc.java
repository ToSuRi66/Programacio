import java.util.Scanner;
import java.util.ArrayList;

public class BaseJoc {
    public void main () {
        Scanner input = new Scanner (System.in);

        int nombreJugadors = 0;
        int rondaLimit = 0;
        int rondaActual = 0;
        ArrayList llistaNoms = new ArrayList();
        boolean jocAcabat = false;

        System.out.printf("Cuants de jugadors: ");
        nombreJugadors = input.nextInt();
        System.out.println("Necessitarem els noms per continuar, llestos");
        String boot = input.nextLine();
        llistaNoms = ControlRondes.guardarNoms(nombreJugadors, llistaNoms);
        System.out.printf("Cuantes rondes voleu jugar? ");
        rondaLimit = input.nextInt();

        Jugar.jugar(nombreJugadors,rondaLimit,llistaNoms);
        System.out.println("Joc acabat");
    }
}
