
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int num1 = Integer.parseInt(scan.nextLine());

        int mod = num1 % 2;

        if (mod == 0) {
            System.out.println("Number " + num1 + " is even.");
        } else {
            System.out.println("Number " + num1 + " is odd.");
        }


    }
}
