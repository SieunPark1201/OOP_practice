package Contests.Week4;

public class Con3_3 {
    public static void main(String[] args) {

        Book1 b1 = new Book1();
        System.out.println(b1);

        Book2 b2 = new Book2();
        System.out.println(b2);

        Book2 b3 = new Book2("Gone with the wind", "Margeret Mitchell");
        System.out.println(b3);

    }
}

class Book1 {
    private String title;
    private String author;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
        return "Book title: " + this.title + ", Author: " + this.author;
    }
}

class Book2 {
    private String title;
    private String author;

    Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book2() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
        return "Book title: " + this.title + ", Author: " + this.author;
    }
}

