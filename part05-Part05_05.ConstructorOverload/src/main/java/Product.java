
public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
// Creating another constructor to change location
    public Product(String name){
        this(name, "shelf", 1);
    }
//Creating constructor to keep name, location, but change weight
    public Product(String name, String location){
        this(name,location, 1);
    }
//Creating constructor to keep name,weight, but change location
    public Product(String name, int weight){
        this(name, "shelf", weight);
    }
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
