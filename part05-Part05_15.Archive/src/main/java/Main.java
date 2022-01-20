import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList();





        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String ident = scanner.nextLine();
            if (ident.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item items = new Item(ident, name);
            if(!list.contains(items)){
                list.add(items);
            }
        }

        System.out.println("==Items==");
        for(Item items : list){
            System.out.println(items);
        }

    }
}
