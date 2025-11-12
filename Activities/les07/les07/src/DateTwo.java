public class DateTwo {

    int dayNumber = 3;

    public void displayDay() {
        if (dayNumber == 1) {
            IO.println("Monday");
        } else if (dayNumber == 2) {
            IO.println("Tuesday");
        } else if (dayNumber == 3) {
            IO.println("Wednesday");
        } else if (dayNumber == 4) {
            IO.println("Thursday");
        } else if (dayNumber == 5) {
            IO.println("Friday");
        } else  if (dayNumber == 6) {
            IO.println("Saturday");
        } else if (dayNumber == 7) {
            IO.println("Sunday");
        } else {
            IO.println("Invalid day number");
        }
    }
}
