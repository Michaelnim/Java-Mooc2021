import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                String read = fileReader.nextLine();
                System.out.println(read);
                names.add(read);
            }


        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }

        System.out.println("");


        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();



        if (names.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }


    }
}
