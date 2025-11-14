import java.util.Scanner;

public class Random {
    public static void main (String[]args){

        int llarg = declararLinies();

        char [][] llista = crearArray(llarg);

        imprimirArray(llista,llarg);
    }

    public static int declararLinies() {
        //Iniciar Scanner
        Scanner input = new Scanner(System.in);

        //Demanar num linies
        System.out.println("Cuantas linias quieres: ");
        int llarg = input.nextInt();
        return llarg;
    }

    public static char[][] crearArray(int llarg) {
        //Iniciar array
        char[][] llista = new char [llarg][llarg];

        //Iniciar variables
        char ple = 'o';
        char buit = ' ';
        int contador1 = 0;//Contador ascendent
        int contador2 = llarg-1;//Contador descendent

        //Bucle per omplir fins a la meitat
        for (int x = 0; x < llarg/2; x++) {

            for (int i = 0; i < llarg; i++) {

                if (contador1>=i || contador2 <=i) {
                    llista[x][i] = ple;
                } else {
                    llista[x][i] = buit;
                }

            }

            //Actualitzar contadors
            contador1++;
            contador2--;

        }

        //Bucle per omplir a partir de la meitat
        for (int x = llarg/2; x < llarg; x++) {

            for (int i = 0; i < llarg; i++) {

                if (contador1 <= i || contador2 >= i) {
                    llista[x][i] = ple;
                } else {
                    llista[x][i] = buit;
                }

            }

            //Actualitzar contadors
            contador1++;
            contador2--;

        }
        return llista;
    }
    public static void imprimirArray(char[][] llista,int llarg) {
        //Bucle per imprimir array
        for (int i = 0; i < llarg; i++) {
            for (int j = 0; j < llarg; j++) {
                System.out.print(llista[i][j]);
            }
            System.out.println();
        }
    }
}
