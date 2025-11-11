import java.util.Scanner;

public class CarsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Quin cotxe vols editar?");
        String eleccio = sc.next();
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        if (eleccio.equals("1")) {
            IO.println("Has triat el num. 1");

        } else if (eleccio.equals("2")) {
            IO.println("Has triat el num. 2");

        }else if (eleccio.equals("3")) {
            IO.println("Has triat el num. 3");

        }else if (eleccio.equals("4")) {
            IO.println("Has triat el num. 4");

        }
        IO.println("Error");
    }
}
