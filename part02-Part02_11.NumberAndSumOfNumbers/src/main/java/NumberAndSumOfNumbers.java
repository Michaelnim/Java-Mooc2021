
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int num = 0;
        int sum = num;


        System.out.println("Give a number:");
        num = Integer.parseInt(scanner.nextLine());
        sum += num;

        while(num !=0){
            System.out.println("Give a number:");
            num = Integer.parseInt(scanner.nextLine());
            count++;
            sum += num;
        }

        System.out.println("Number of numbers: " +count);
        System.out.println("Sum of the numbers: " +sum);





    }
}
