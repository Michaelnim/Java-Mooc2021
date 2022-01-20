
public class Main {

    public static void main(String[] args) {
        SimpleDate now = new SimpleDate(29, 12, 2015);
        now.advance();
        System.out.println(now);

        now.advance();
        System.out.println(now);

        now.advance();
        System.out.println(now);


    }
}
