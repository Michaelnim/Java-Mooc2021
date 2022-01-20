public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;


    //Constructor
    public Game(String hTeam, String aTeam, int hScore, int aScore) {
        this.homeTeam = hTeam;
        this.awayTeam = aTeam;
        this.homeScore = hScore;
        this.awayScore = aScore;

    }

    //Getters
    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public int getHomeScore() {
        return this.homeScore;
    }

    public int getAwayScore() {
        return this.awayScore;
    }

    public String getWinner() {
        if (this.homeScore > this.awayScore) {
            return this.homeTeam;
        } else {
            return this.awayTeam;
        }
    }

    public String getLoser() {
        if (this.homeScore > this.awayScore) {
            return this.awayTeam;
        } else {
            return this.homeTeam;
        }
    }

    @Override
    public  String toString(){
        return  "Score: H: " + this.homeTeam + " " + this.homeScore + " vs " + this.awayScore + " A:" + this.awayTeam + "\n";
    }











}

