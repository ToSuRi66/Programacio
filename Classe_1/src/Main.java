

public class Main {

    public static void main(String[] args) {

        //Creació d'Objectes
        Dog dog1;
        dog1 = new Dog();

        //Assignació de valors
        dog1.name = "Tobby";
        dog1.age = 2;
        dog1.race = "Teckel";
        dog1.dangerous = false;

        //Execució de metode
        dog1.displayDog();

        //Creació d'Objectes
        Dog dog2;
        dog2 = new Dog();

        //Assignació de valors
        dog2.name = "Mikey";
        dog2.age = 4;
        dog2.race = "Mastiff";
        dog2.dangerous = false;

        //Execució de metode
        dog2.displayDog();
    }

}