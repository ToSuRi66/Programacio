public class Elevator {

    public boolean doorOpen = false; //Doors are closed by default
    public int currentFloor = 1; //All elevators start on first floor
    public final int TOP_FLOOR = 10;
    public final int MIN_FLOOR = 1;

    public void openDoor() {
        System.out.println("Opening Door");
        doorOpen = true;
        System.out.println("Door is open.");
    }
    public void closeDoor() {
        System.out.println("Closing Door");
        doorOpen = false;
        System.out.println("Door is closed.");
    }

    public void goUp () {
        if (currentFloor == TOP_FLOOR) {
            System.out.println("Cannot Go Up");
        } else {

            if (!doorOpen) {
                System.out.println("Going up one floor");
                currentFloor++;
                System.out.println("Floor: " + currentFloor);
            }
        }
    }

    public void goDown () {
        if (currentFloor == MIN_FLOOR) {
            System.out.println("Cannot Go Down");
        } else {

            if (!doorOpen) { //Comprova porta tancada
                System.out.println("Going down one floor");
                currentFloor--;
                System.out.println("Floor: " + currentFloor);
            }
        }
    }

    public void setFloor() {
        int desiredFloor = 5;

        do{
            if (currentFloor < desiredFloor){
                goUp();
            } else if (currentFloor > desiredFloor){
                goDown();
            }
        } while (currentFloor != desiredFloor);
    }
}
