public class Fitbyte {
    private int age;
    private int restingHeartRate;

//Constructor
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;

    }

    // Method to obtain heart rate
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return (maxHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }






}
