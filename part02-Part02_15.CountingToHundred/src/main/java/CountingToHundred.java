
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        for (int i = user; i <=100; i++){
            System.out.println(i);
        }


    }
}
