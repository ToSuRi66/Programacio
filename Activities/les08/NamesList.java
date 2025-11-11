//Practice 8-2 - ArrayList class

import java.util.ArrayList;

public class NamesList {
    ArrayList listOfNames;

    public void setList() {
        listOfNames = new ArrayList();
        listOfNames.add("Toni Sureda");
        listOfNames.add("Tomeu Quely");
        listOfNames.add("Max Verstappen");
        listOfNames.add("Fernando Alonso");

        System.out.println("Names list: " + listOfNames);
        System.out.println("Size of ArrayList: " + listOfNames.size());
    }

    public void manipulateList() {
        listOfNames.remove(3);
        System.out.println("Names remaining: " + listOfNames);
        System.out.println("Remaining size: " + listOfNames.size());
        listOfNames.add(1,"Fernando Alonso");
        System.out.println("Names list again: " + listOfNames);
        System.out.println("Size of ArrayList: " + listOfNames.size());

    }

}
