
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> avgList = new ArrayList<>();


        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            avgList.add(input);
        }

        int sum = 0;
        double avg;
        for (Integer integer : avgList) {
            sum += integer;
        }

        avg = (double) sum / avgList.size();
        System.out.println(avg);
    }


}
