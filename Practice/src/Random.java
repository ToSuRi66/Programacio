import java.util.Scanner;

public class Random {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        String [][] bidi = new String[5][3];

        System.out.println("Informació sobre 5 persones:");
        for(int i = 0; i<5 ; i++){
            System.out.printf("Persona: %d\n",i+1);
            for (int k = 0; k<3;k++){
                if (k%3 == 0){
                    System.out.print("Nom: ");
                    bidi[i][k]=input.nextLine();
                } else if (k%3 == 1){
                    System.out.print("Llinatge: ");
                    bidi[i][k]=input.nextLine();
                } else {
                    System.out.print("Edad: ");
                    bidi[i][k]=input.nextLine();
                }
            }
        }
        for(int i = 0; i<5 ; i++){
            System.out.printf("Persona: %d\n",i+1);
            for (int k = 0; k<3;k++){
                if (k%3 == 0){
                    System.out.printf("Nom: %S\n",bidi[i][k]);
                } else if (k%3 == 1){
                    System.out.printf("Llinatge: %S\n",bidi[i][k]);
                } else {
                    System.out.printf("Edad: %S\n",bidi[i][k]);
                }
            }
        }

    }
}
