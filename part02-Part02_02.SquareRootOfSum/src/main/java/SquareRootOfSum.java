import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f1 = Integer.valueOf(scanner.nextLine());
        int f2 = Integer.valueOf(scanner.nextLine());
        int sum = f1 + f2;
        int sRoot = (int) Math.sqrt(sum);
        System.out.println(sRoot);


    }
}
