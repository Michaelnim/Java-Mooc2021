import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> Items;
    private int maxWeight;

    public Suitcase(int maxWeight){
    this.Items = new ArrayList<>();
    this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
         this.Items.add(item);
    }


    @Override
    public String toString(){
        return Items.size() + Items.get(0);
    }






}
