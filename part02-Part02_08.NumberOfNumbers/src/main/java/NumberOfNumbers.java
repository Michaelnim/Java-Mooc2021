
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());

        int count = 0;

        while(num !=0){
            System.out.println("Give a number:");
            num = Integer.parseInt(scanner.nextLine());
            count++;
        }

        System.out.println("Number of numbers: " +count);

















    }
}

