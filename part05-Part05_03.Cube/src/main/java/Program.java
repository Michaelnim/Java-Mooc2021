
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube testing = new Cube(4);
        System.out.println(testing.volume());
        System.out.println(testing.toString());

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);

    }
}
