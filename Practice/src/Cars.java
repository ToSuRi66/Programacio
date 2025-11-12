import java.util.Scanner;

public class Cars {

    Scanner sc = new Scanner(System.in);

    public String matricula = "0000AAA"; // Matricula española
    public String marca = "Marca";
    public String modelo = "Model";
    public String color = "Color";
    public char typeComb = 'C'; // G = Gasoline, D = Diesel, E = Electric, H = Hybrid
    public float liters = 0.0F; // Ex: 1.4 o 0.6 ...
    public int power = 0; // Potencia en CV: 95, 120, ...
    public String resum = ""; //Unió de tota la informació
    public String combustible = "Null";


    //Modificar combustible
    public void modCombustible() {
        if (typeComb == 'C') {
            combustible = "No especificat";
        } else if (typeComb == 'G') {
            combustible = "Benzina";
        } else if (typeComb == 'D') {
            combustible = "Diesel";
        } else if (typeComb == 'E') {
            combustible = "Electric";
        }else if (typeComb == 'H') {
            combustible = "Hibrid";
        }
    }

    public void displayInformation() {
        IO.println("Matricula: " + matricula);
        IO.println("Marca: " + marca);
        IO.println("Model: " + modelo);
        IO.println("Color: " + color);
        IO.println("Tipus de combustible: " + typeComb);
        IO.println("Liters: " + liters);
        IO.println("Potencia: " + power);
    }
    public void modInformation() {
        IO.println("Introdueix la matricula: (0000AAA)");
        matricula = sc.nextLine();
        IO.println("Introdueix la marca: ");
        marca = sc.nextLine().toUpperCase();
        IO.println("Introdueix el model: ");
        modelo = sc.nextLine().toUpperCase();
        IO.println("Introdueix el color: (CATALÀ)");
        color = sc.nextLine().toUpperCase();
        IO.println("Introdueix el tipus de combustible: G = Gasoline, D = Diesel, E = Electric, H = Hybrid");
        typeComb = sc.next().charAt(0);
        if (typeComb == 'E') {
            IO.println("Introdueix els litres: ");
            liters = sc.nextFloat();
        }
        modCombustible();
        IO.println("Introdueix la potencia: ");
        power = sc.nextInt();
    }

    public void resumInformacio() {
        resum = "El teu cotxe amb matricula " + matricula + ", es un " + marca + modelo + " de color " + color;
        if (typeComb == 'E') {
            resum = resum.concat("Es " + combustible + " de " + liters + "amb una potencia de " + power + "CV");
        } else {
            resum = resum.concat("Te un motor " + typeComb + " de " + liters + "L i amb una potencia de " + power + "CV");
        }
    }
}
