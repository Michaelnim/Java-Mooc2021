import java.util.ArrayList;

//Class Package using Gift class
public class Package {


//ArrayList to keep track of Gift packages
    private ArrayList<Gift> packs;


//No parameter constructor but adds Gifts into arraylist
    public Package(){
        this.packs = new ArrayList<>();

    }

//Adding gifts into arraylist
    public void addGift(Gift gift){
        packs.add(gift);
    }

//Getting total weight of all gifts
    public int totalWeight(){
        int total = 0;
        for(Gift weight : packs){
            total += weight.getWeight();
        }
        return total;
    }



}
