
import java.util.ArrayList;

public class SimpleCollection {
    private int count = 0;
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        //String variable created in order to print out what's needed
        String printOutput = "";

        //If list is empty print statement
        if (this.elements.isEmpty()) {
            printOutput = "The collection " + this.name + " is empty.";
            return printOutput;

            //else if it has a SINGLE element print it out
        } else if (this.elements.size() == 1) {
            printOutput = "The collection " + this.name + " has " + this.getElements().size() + " element:"
                    + "\n" + this.elements.get(0);
            return printOutput;
        } else {

            // Going through the LIST of elements and shoving them into items to return them into String variable
            String items = "";
            printOutput = "The collection " + this.name + " has " + this.getElements().size() + " elements:"
                    + "\n";
            for (String e : elements) {
                items += e + "\n";
            }
            return printOutput + items;
        }


    }
}