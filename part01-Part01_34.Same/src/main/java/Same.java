
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter two strings:");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        System.out.println(s1.equals(s2) ? "Same" : "Different");

    }
}
