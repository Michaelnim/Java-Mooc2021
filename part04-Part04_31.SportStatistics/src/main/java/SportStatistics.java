import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;

        //Asking for file name
        System.out.println("File: ");
        String fileName = scanner.nextLine();


        // Scanner to read the txt file
        ArrayList<Game> stats = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String readRow = fileReader.nextLine();
                String[] gameData = readRow.split(",");
                if (readRow.isEmpty()) {
                    continue;
                }

                // Adds the data to stats list
                stats.add(new Game(gameData[0], gameData[1], Integer.valueOf(gameData[2]), Integer.valueOf(gameData[3])));


            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Asks the user for team name
        System.out.println("Team:");
        String teamName = scanner.nextLine();

        //finds how many games each team has played by looking at the input
        for (Game stat : stats) {
            //performs the object methods to calculate winners and losers
            stat.getWinner();
            stat.getLoser();
            if (stat.getHomeTeam().equals(teamName) || stat.getAwayTeam().equals(teamName)) {
                gameCount++;
            }

            //counts how many times the team has been winner
            if (stat.getWinner().equals(teamName)) {
                winCount++;
            }
            //counts how many teams the team has been a loser
            if (stat.getLoser().equals(teamName)) {
                lossCount++;
            }

        }

        //prints results to user
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);


    }

}


