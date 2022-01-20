
public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String iniName, double iniPrice, int iniQuantity){
        this.name = iniName;
        this.price = iniPrice;
        this.quantity = iniQuantity;

    }

    public void printProduct(){
        System.out.println(name+ ", price "+price+ ", " +quantity+ " pcs");
    }













}
