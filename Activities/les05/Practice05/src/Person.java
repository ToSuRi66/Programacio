public class Person {
    int ageYears = 24;
    int ageDays;
    long ageMinutes;
    long ageSeconds;
    long ageMilliseconds;

    public void calculateAge () {
        ageDays = ageYears * 365;
        ageSeconds = ageDays * 24 * 60 * 60;
        ageMinutes = ageSeconds / 60;
        ageMilliseconds = ageSeconds * 1000;

        IO.println("You are " + ageDays + " days old");
        IO.println("You are " + ageMinutes + " minutes old");
        IO.println("You are " + ageSeconds + " seconds old");
        IO.println("You are " + ageMilliseconds + " milliseconds old");

    }

}
