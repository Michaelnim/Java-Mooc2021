import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Name of TV show: ");
            String tvName = scanner.nextLine();
            if(tvName.isEmpty()){
                break;
            }

            System.out.println("Tv show duration: ");
            int tvDuration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(tvName, tvDuration));

        }

        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for(TelevisionProgram program : programs){
            if(program.getDuration() <= maxDuration){
                System.out.println(program.toString());
            }
        }




    }
}
