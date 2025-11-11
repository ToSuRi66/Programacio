
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NamesListTwo {
    public ArrayList listOfNames;
    
    public void setList(){
        listOfNames = new ArrayList();
        listOfNames.add("Joe Smith");
        listOfNames.add("Mary Palmer");
        listOfNames.add("Jose Gonzalez");
        listOfNames.add("Linda Baker");
        listOfNames.add("Tomeu Quely");
        System.out.println("Size of ArrayList is: " + listOfNames.size());
    }

    public void displayNames(){
        System.out.println("Noms a sa ArrayList: ");
        for ( Object name : listOfNames){
            System.out.println(name);
        }
    }
       
}
