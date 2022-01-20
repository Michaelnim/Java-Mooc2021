import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookInformation = new ArrayList();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Title of book: ");
            String book = scanner.nextLine();
            if (book.isEmpty()) {
                break;
            }


            System.out.println("Number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            bookInformation.add(new Book(book, pages, year));

        }

        System.out.println("What information will be printed: ");
        String information = scanner.nextLine();

        for (Book book : bookInformation) {
            if (information.equalsIgnoreCase("everything"))
                System.out.println(book.toString());


            if (information.equalsIgnoreCase("name")) {
                System.out.println(book.getTitle());
            }
            if (information.equalsIgnoreCase("year")) {
                System.out.println(book.getYear());
            }
            if(information.equalsIgnoreCase("page")){
                System.out.println(book.getPages());
            }

        }

    }
}
