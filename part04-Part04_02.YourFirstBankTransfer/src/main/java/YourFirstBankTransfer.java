
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Matthews = new Account("Matthews account", 1000);
        Account mine = new Account("My account", 0);

        Matthews.withdrawal(100);
        mine.deposit(100);

        System.out.println(Matthews);
        System.out.println(mine);

    }
}
