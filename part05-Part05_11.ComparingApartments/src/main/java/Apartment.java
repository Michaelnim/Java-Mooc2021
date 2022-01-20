
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.rooms > compared.rooms){
            return true;
        }
        if(this.rooms < compared.rooms){
            return false;
        }
        if(this.squares > compared.squares){
            return true;
        }
        if(this.squares < compared.squares){
            return false;
        }
        if(this.princePerSquare > compared.princePerSquare){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
       int price = this.squares * this.princePerSquare;
       return Math.abs(compared.princePerSquare* compared.squares - price);


    }

    public boolean moreExpensiveThan(Apartment compared){
        int firstApt = this.rooms * this.squares * this.princePerSquare;
        int secondApt = compared.rooms * compared.squares * compared.princePerSquare;

        if(firstApt > secondApt){
            return true;
        }
        return false;
    }


}
