
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for? ");
        int search = Integer.parseInt(scanner.nextLine());


        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if(number == search){
                System.out.println(number + " is at index " + i);
            }

        }



    }
}
