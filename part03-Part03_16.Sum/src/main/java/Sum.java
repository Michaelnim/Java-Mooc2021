
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));
    }


    public static int sum(ArrayList<Integer> mList) {
        if (mList.size() == 0) {
            return 0;
        }

        int sum = 0;
        for (Integer integer : mList) {
            sum += integer;
        }
        return sum;

    }


}
