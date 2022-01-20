
public class MainProgram {

    public static void main(String[] args) {


        Counter testing = new Counter(10);

        System.out.println(testing.value());
        testing.decrease(-5);
        System.out.println(testing.value());
        testing.decrease(10);
        System.out.println(testing.value());
    }
}
