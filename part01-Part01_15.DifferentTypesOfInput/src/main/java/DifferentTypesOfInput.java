
import java.sql.SQLOutput;
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double dub = Double.valueOf((scan.nextLine()));

        System.out.println("Give a boolean:");
        boolean boo = Boolean.valueOf((scan.nextLine()));

        System.out.println("You gave the string " +string);
        System.out.println("You gave the integer " +num);
        System.out.println("You gave the double " +dub);
        System.out.println("You gave the boolean " +boo);

    }
}
