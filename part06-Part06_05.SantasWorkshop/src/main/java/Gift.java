public class Gift {
    private String name;
    private int weight;

//Constructor to create gift object
    public Gift(String giftName, int giftWeight){
        this.name = giftName;
        this.weight = giftWeight;

    }
//Get gift name
    public String getName(){
        return this.name;
    }
//Get gift weight
    public int getWeight(){
        return this.weight;
    }

//When calling just object name prints out toString
    @Override
    public String toString(){
        return this.name + " ("+this.weight+" kg)";
    }


}
