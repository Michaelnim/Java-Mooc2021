
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }








    public static void removeLast(ArrayList<String> mlString) {
       if(!mlString.isEmpty()){
           mlString.remove(mlString.size() - 1);
       }





    }
}
