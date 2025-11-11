public class Sequence {

    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber;
    final int SEQUENCE_LIMIT = 1000000000;

    public void displaySequence (){
        //Imprime los 2 primeros numeros
        System.out.print(firstNumber + " " + secondNumber);
        //Calcular el numero
        nextNumber = firstNumber + secondNumber;
        while(nextNumber < SEQUENCE_LIMIT) {
            System.out.print(" " + nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
        System.out.println(" Build Succesful...");
    }

}
