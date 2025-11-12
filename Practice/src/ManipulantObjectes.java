import java.util.Scanner;

public class ManipulantObjectes {
    public static void main(String[] args) {

        String objecte1 = "";
        String objecte2 = "";
        String objecte3 = "";

        Scanner input = new Scanner(System.in);
        IO.println("El teu nom:");
        objecte1 = input.nextLine() + " ";
        objecte1 = objecte1.toUpperCase();
        IO.println("El teu primer llinatge:");
        objecte2 = input.nextLine() + " ";
        objecte2 = objecte2.toUpperCase();
        IO.println("El teu segon llinatge:");
        objecte3 = input.nextLine() + " ";
        objecte3 = objecte3.toUpperCase();
        String nomComplet = " ";
        nomComplet =objecte1.concat(objecte2);
        nomComplet = nomComplet +  objecte3;
        IO.println("El teu nom complet es: " + nomComplet);
        int llarg = 0;
        llarg = nomComplet.length() + 1;
        IO.println("El teu nom te " + llarg + " lletres");


    }
}
