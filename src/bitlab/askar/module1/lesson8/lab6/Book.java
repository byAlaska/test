package bitlab.askar.module1.lesson8.lab6;

public class Book {

    private String name;
    private String author;
    private int isbn;
    private int price;

    public Book() {
    }

    public Book(String name, String author, int isbn, int price) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  name + ", " + author + ", " + isbn + ", " + price + "\n";
    }
}
