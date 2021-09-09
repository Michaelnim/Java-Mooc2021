
import java.sql.SQLOutput;
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int user = scanner.nextInt();

        for(int i = 0; i < user; i++){
            printText();
        }
    }


    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
