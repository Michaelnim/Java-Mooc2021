
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> inRoom;

    public Room() {
        this.inRoom = new ArrayList<>();
    }


    //Using Person to add them into arraylist
    public void add(Person person) {
        inRoom.add(person);
    }

    //Checking if the room is empty
    public boolean isEmpty() {
        if (inRoom.isEmpty()) {
            return true;
        }
        return false;
    }

    // For loop to show how many people are still in the room
    public ArrayList<Person> getPersons() {
        for (Person people : inRoom) {
            if (!inRoom.isEmpty()) {
                return inRoom;
            }
        }
        return null;
    }

    //Finding the shortest in the arraylist
    //Returns null if empty
    public Person shortest() {
        if (inRoom.isEmpty()) {
            return null;
        }
        //Need a variable to compare with list grabbed rooms 0 index and shoved it into returnShortest
        Person returnShortest = this.inRoom.get(0);

        //For loop to iterate through list to find shortest
        for (Person shortest : inRoom) {
            if (returnShortest.getHeight() > shortest.getHeight()) {
                returnShortest = shortest;
            }
        }
        return returnShortest;

    }
//If room is empty return null
    public Person take() {
        if (inRoom.isEmpty()) {
            return null;
        }
        //Using shortest method above to grab shortest in arraylist and deleting it
        Person shortest = this.shortest();
        this.inRoom.remove(shortest);
        return shortest;

    }
}
