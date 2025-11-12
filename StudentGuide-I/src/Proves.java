public class Proves {
    public static void main(String []args) {

        /*
        float square = 144;
        float squareRoot = square;
        while (squareRoot * squareRoot - square > 0.001) {
            squareRoot = (squareRoot + square / squareRoot)/2;
            System.out.println("Next try will be " + squareRoot);
        }
        System.out.println("Square root of " + square + " is " + squareRoot);
        */
        /*
        int initialSum = 500;
        int interest = 7;
        int years = 0;
        int currentSum = initialSum * 100;
        while (currentSum <= 100000) {
            currentSum += currentSum * interest/100;
            years++;
            System.out.println("Year " + years + ": " + currentSum/100);
        }*/
        /*
        System.out.println("   /*");
        int counter = 0;
        while (counter < 4){
            System.out.println("    *");
            counter++;
        }
        System.out.println("    *//*");*/
        /*
        for (String i = "|", t = "------"; i.length() < 7; i += "|" , t = t.substring(1)){
            System.out.println(i + t);
        }*/
        /*
        int height = 4;
        int width = 10;
        for (int rowCount = 0; rowCount < height; rowCount++){
            for (int colCount = 0; colCount < width; colCount++){
                System.out.print("@");
            }
            System.out.println();
        }*/

        String name = "Yeray";
        String guess = "";
        long numTries = 0;
        while (!guess.equals(name.toLowerCase())) {
            guess = "";
            while (guess.length() < name.length()) {
                char asciiChar = (char) (Math.random() * 26 + 97);
                guess = guess + asciiChar;
            }
            System.out.println(numTries + " " + guess);
            numTries++;
        }
        System.out.println(name + " found after " + numTries + " tries!");


    }
}

