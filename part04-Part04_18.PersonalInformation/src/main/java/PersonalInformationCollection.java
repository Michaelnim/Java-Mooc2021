
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First name: ");
            String fName = scanner.nextLine();
            if(fName.isEmpty()){
                break;
            }

            System.out.println("Last name: ");
            String lName = scanner.nextLine();

            System.out.println("Identification number: ");
            String idNum = scanner.nextLine();

            PersonalInformation info = new PersonalInformation(fName, lName, idNum);
            infoCollection.add(info);
        }

        for(PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName() + " " +  info.getLastName());
        }



    }
}
