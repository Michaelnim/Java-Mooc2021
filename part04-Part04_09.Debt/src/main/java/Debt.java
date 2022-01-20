public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double inibalance, double iniRate){
        this.balance = inibalance;
        this.interestRate = iniRate;
    }

    public void printBalance(){
        System.out.println(balance);
    }

    public void waitOneYear(){
       double debt = balance * interestRate;
       balance = debt;
    }









}
