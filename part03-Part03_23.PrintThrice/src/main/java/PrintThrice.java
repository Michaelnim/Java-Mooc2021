
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String user = scanner.next();

       String phrase = user + user + user;
        System.out.println(phrase);

    }
}
