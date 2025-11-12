import java.util.Scanner;
import java.lang.Math;

//Exercicis PDF 15 - 22

public class Problemes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        IO.println("Quin exercici vols provar?");
        int exercici2 = input.nextInt();

        switch (exercici2) {
            case 1:
                //Ex: 1 - Mostrar overflow
                int numOver1 = 2147483647;
                int numOver2 = 2147483647;
                //Treure resultat
                int resultatOver = numOver1 + numOver2;
                IO.println("Overflow: " + resultatOver);
                break;
            case 2:
                //Ex: 2 - Imprimir una frase de diferents maneres
                int width;
                int height = 3;
                //Fer frase
                StringBuilder frase = new StringBuilder();
                Scanner inFrase = new Scanner(System.in);
                IO.println("Introdueix la frase amb 2 espais: ");
                frase.append(inFrase.nextLine());
                StringBuilder form = new StringBuilder();
                //frase.append("Saber es Poder");
                //Escriure frase completa
                IO.println("Frase completa:" + frase);
                IO.println("Frase en linies diferents:");
                //Trobar espais
                int index = frase.indexOf(" ");
                int index2 = frase.lastIndexOf(" ");
                //Imprimir separant els espais
                IO.println(frase.substring(0, index));
                IO.println(frase.substring(index + 1, index2));
                IO.println(frase.substring(index2 + 1, frase.length()));
                //Text dins box
                IO.println("Frase dins capsa:");
                width = frase.length();
                form.append('|');
                form.append('|');
                //Crear capsa
                for (int i = 0; i < height; i++) {
                    if (i == 0) {
                        for (int j = 0; j < width; j++) {
                            form.insert(1, '=');
                        }
                        IO.println(form);
                    } else if (i == 1) {
                        frase.insert(0, '|');
                        frase.insert(width + 1, '|');
                        IO.println(frase);
                    } else if (i == 2) {
                        IO.println(form);
                    }
                }
                break;
            case 3:
                //Ex: 3 - Calculs de numeros
                System.out.println("Nombre real:");
                double real = input.nextDouble();
                System.out.println("Nombre enter:");
                int enter = input.nextInt();
                //Dividir nombres
                float division = (float) (real / enter);
                //Treure el residu de la divisió
                int modulo = (int)(division % enter);
                System.out.println("El resultado de la division " + division + " y del modulo " + modulo);
                break;
            case 4:
                //Ex: 4 - Conversió a Fahrenheit amb 4 decimals
                System.out.println("Graus centigrads: ");
                float centigrados = input.nextFloat();
                float fahrenheit = (centigrados * 9/5) + 32;
                System.out.printf("El resultado de la conversion es: %.4f ºF",fahrenheit);
                break;
            case 5:
                //Ex: 5 - Manipular edat i estatura
                System.out.println("Nom: ");
                String nom = input.nextLine();
                System.out.println("Edat: ");
                byte edat = input.nextByte();
                System.out.println("Estatura: ");
                double estatura = input.nextDouble();
                edat = (byte) (edat +2);
                System.out.println(edat);
                estatura = estatura / 2;
                System.out.println(estatura);
                break;
            case 6:
                //Ex: 6 - Nombre
                System.out.println("Nombre:");
                String name = input.nextLine();
                System.out.printf("Hola, %s", name);
                break;
            case 7:
                //Ex: 7 - Cambio de monedas
                System.out.println("Quarters:");
                int quarter = input.nextInt();
                System.out.println("Dime:");
                int dime = input.nextInt();
                System.out.println("Nickel:");
                int nickel = input.nextInt();
                System.out.println("Penny:");
                int penny = input.nextInt();
                double dolares = 0.00;
                int quarterTotal = quarter * 25;
                int dimeTotal = dime * 10;
                int nickelTotal = nickel * 5;
                int pennyTotal = penny;
                double totalCentavos = quarterTotal + dimeTotal + nickelTotal + pennyTotal;
                dolares = totalCentavos / 100;
                IO.println("Total: " + dolares + "dollars");
                break;
            case 8:
                //Ex: 8 - Unidades a docenas
                int numOriginal = 0;
                System.out.println("Numero original:");
                numOriginal = input.nextInt();
                int docenas = numOriginal / 12;
                int docenasTest = docenas * 12;
                int unidades = numOriginal - docenasTest;
                System.out.printf("%d docenas i %d unidades", docenas, unidades);
                break;
            case 9:
                //Ex: 9 - Ecuació generica
                double a,b,c;
                System.out.println("a: ");
                a = input.nextDouble();
                System.out.println("b: ");
                b = input.nextDouble();
                System.out.println("c: ");
                c = input.nextDouble();
                System.out.println("x:");
                double x = input.nextDouble();
                double y = a* Math.pow(x,2) + b*x + c;
                System.out.println(y);
                break;

        }
    }
}
