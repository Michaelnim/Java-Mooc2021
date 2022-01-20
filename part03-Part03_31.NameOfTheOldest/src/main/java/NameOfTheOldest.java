
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int greatest = 0;
        String oldest = null;


        while (!input.isEmpty()) {
            String[] arr = input.split(",");
            for (int i = 1; i < arr.length; i = i + 2) {
                if (Integer.parseInt(arr[i]) > greatest) {
                    greatest = Integer.parseInt(arr[i]);
                    oldest = arr[i - 1];
                }


            }

            input = scanner.nextLine();

        }

        System.out.println(oldest);


    }
}
