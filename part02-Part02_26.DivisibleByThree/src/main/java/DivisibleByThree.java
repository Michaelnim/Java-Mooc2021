
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
    }


    public static void divisibleByThreeInRange(int begin, int end) {

        for (int i = begin; i <= end; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }


    }


}



