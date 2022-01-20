

public class Timer {
    private ClockHand hundreds = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);


    //Using ClockHands to advance time
    public void advance(){
        this.hundreds.advance();

//Condition of hundreds to advance seconds
        if(this.hundreds.value() == 0){
            this.seconds.advance();
        }

    }

// Prints out Timer
public String toString(){
        return this.seconds + ":" + this.hundreds;
}




}
