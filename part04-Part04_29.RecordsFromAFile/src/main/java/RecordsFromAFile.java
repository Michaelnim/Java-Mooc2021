import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of file: ");
        String fileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNext()){
                String row = fileReader.nextLine();
                if(row.isEmpty()){
                    continue;
                }
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name + ", age: " +age+ " years");
            }
        } catch (Exception e){
            System.out.println("Error:" +e.getMessage());
        }


    }
}
