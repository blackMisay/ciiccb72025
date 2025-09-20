package ciiccb72025.chapter4.Task11;

public class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + '\"' + "\n" +
                "Author: \"" + author + '\"' + "\n" +
                "Year Published: " + yearPublished + "\n" +
                "Price: $" + price + "\n";
    }
}
