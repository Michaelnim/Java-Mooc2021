import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<String> listNumbers = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                String row = fileReader.nextLine();
                System.out.println(row);
                listNumbers.add(row);
            }

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        System.out.println("");

        int count = 0;
        for (String item : listNumbers) {
            int number = Integer.valueOf(item);
            if (number >= lowerBound && number <= upperBound) {
                count += 1;
            } else {
                continue;
            }
        }

        System.out.println("Numbers: " + count);
    }

}




