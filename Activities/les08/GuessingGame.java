//Practice 8-3 GuessingGame
import java.lang.Math.*;

public class GuessingGame {
    public static void main (String []args){

        if ( args.length == 0 || args[0].equals("help")){
            System.out.println("Correct Usage");
        } else {
            int randomNum = ((int) (Math.random()*5)+1);
            int guess  = Integer.parseInt(args[0]);

            if (guess < 1 || guess > 5) {
                System.out.println("Error, argument invalid");
            } else {
                if (guess == randomNum) {
                    System.out.println("Enhorabona, has acertat");
                } else {
                    System.out.println("Me sap greu, has fallat, el nombre correcte era: " + randomNum);
                }
            }
        }

    }
}
