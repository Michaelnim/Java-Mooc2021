
public class HealthStation {
private int count = 0;


// Getting a persons weight
    public int weigh(Person person) {
        count++;
        return person.getWeight();


    }

//Getting the persons weight and increasing it by 1
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);

    }
//Keeping count of how many weighings there's been
    public int weighings() {
    return count;
    }


}
