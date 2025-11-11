public class Clock {

    int currentTime = 541;

    public void displayPartOfDay() {
        if (currentTime >=801 && currentTime <= 1200){
            IO.println("Morning");
        } else if (currentTime >=1201 && currentTime <= 1700){
            IO.println("Afternoon");
        } else if (currentTime >=1701 &&currentTime <= 2400) {
            IO.println("Evening");
        } else if (currentTime >=1 && currentTime <= 800) {
            IO.println("Early Morning");
        }
    }

}
