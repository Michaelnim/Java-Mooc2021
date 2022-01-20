
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

     while(true){
         String name = scanner.nextLine();
         if(name.isEmpty()){
             break;
         }

         Item newName = new Item(name);
         items.add(newName);

     }
    for(Item names : items){
        System.out.println(names.toString());
    }






    }
}
