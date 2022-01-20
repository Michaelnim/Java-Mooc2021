
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String userName = scanner.nextLine();

        System.out.println("Enter password: ");
        String passWord = scanner.nextLine()
                    ;

        if(userName.equals("alex") && passWord.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        }
        else if (userName.equals("emma") && passWord.equals("haskell")){
            System.out.println(" You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }





    }
}
