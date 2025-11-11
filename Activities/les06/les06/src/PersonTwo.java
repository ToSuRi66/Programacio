public class PersonTwo {

    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();

    public void displayPersonInfo() {
        name.append("Max");
        name.append(" ");
        name.append("Verstappen");

        //Display Name
        IO.println("Name: " + name.toString());

        //Display Capacity
        IO.println("Name object capacity: " + name.capacity());

        //Phone number
        phoneNumber.append("1116482375");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");
        IO.println("Phone number: " + phoneNumber.toString());

        //First Name
        IO.println("First name: " + name.substring(0,3));

    }

}
