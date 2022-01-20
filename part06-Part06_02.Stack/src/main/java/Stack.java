import java.util.ArrayList;

public class Stack {
//Need this to create a stack class
    private final ArrayList<String> list = new ArrayList<>();

//Checks if the list is empty or not
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
//To add elements into ArrayList
    public void add(String value) {
        list.add(value);

    }
//Returns the element in the ArrayList
    public ArrayList<String> values() {
        return list;
    }

//LIFO(Stack) taking the Last element in the Arraylist Popping it off.
    public String take(){
        final String topMost = list.get(list.size() - 1);
        list.remove(topMost);
        return topMost;
        }


}