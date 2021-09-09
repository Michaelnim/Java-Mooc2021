
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int input = Integer.parseInt(scanner.nextLine());

        int sum = input;
        while (input != 0) {
            System.out.println("Give a number:");
            input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}