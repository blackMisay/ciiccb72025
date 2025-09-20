package ciiccb72025.chapter4.Task11;

public class Main {
    
    public static void main(String[] args) {
        
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("1984", "George Orwell", 1949, 8.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 12.99);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
