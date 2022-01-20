
import java.util.ArrayList;

public class SimpleCollection {

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

    //Finding the longest string in the arraylist
    //If array is empty return EMPTY
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        // Creating a string variable to compare and return longest string in arraylist
        String returnLongest = elements.get(0);

        // For loop to iterate through the ELEMENTSlist
        for(String longest : elements){
            if(returnLongest.length() < longest.length()){
                returnLongest = longest;
            }
        }

return returnLongest;
    }
}