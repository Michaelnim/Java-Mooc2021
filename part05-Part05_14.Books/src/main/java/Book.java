
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    //Creating a boolean equals to check if the books are contained in the list
    public boolean equals(Object compared) {
        Book book = (Book) compared;
        return this.name.equals(((Book) compared).name) && this.publicationYear == ((Book) compared).publicationYear;
    }


}
