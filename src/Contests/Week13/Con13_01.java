package Contests.Week13;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
public class Con13_01 {

    private static ArrayList<Book> books = new ArrayList<>(5);

    public static void main(String[] args) {

        addBook(101, "Java Basics", "John Doe", 2020);
        addBook(102, "Data Structures", "Alice Bob", 2019);
        addBook(103, "Algorithms", "Carol Dan", 2018);
        addBook(104, "Database Systems", "Eve Frank", 2021);
        addBook(105, "Operating Systems", "Grace Hopper", 2022);
        addBook(106, "Computer Networks", "Ian Jolt", 2023);
        System.out.println("[Adding six books (101 - 106)]");
        displayBooks();

        updateBook(103,"Advanced Algorithms", "Carol Dan", 2024);
        System.out.println("\n[Updating book 103]");
        displayBooks();

        removeBook(105);
        System.out.println("\n[Removing book 105]");
        displayBooks();

        insertBook(102, 107, "Parallel Systems", "David Cooper", 2004);
        System.out.println("\n[Inserting book before 102]");
        displayBooks();

        System.out.println("\n[Inserting book before 105]");
        insertBook(105, 108, "Computer Graphics", "Mark Lee", 2012);
        System.out.println("\n[Updating book before 110]");
        updateBook(110, "Computer Graphics", "Mark Lee", 2012);
        System.out.println("\n[Removing book 108]");
        removeBook(108);

        System.out.println("\n[Inserting book before 101]");
        insertBook(101, 108, "Computer Graphics", "Mark Lee", 2012);
        displayBooks();

    }

    public static void addBook(int id, String title, String author, int year){
        Book book = new Book(id, title, author, year);
        books.add(book);
    }


    public static void displayBooks(){
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).toString());
        }
    }

    public static void updateBook(int id, String title, String author, int year){
        Book book = new Book(id, title, author, year);
        Boolean trueOrFalse = true;

        for (int i = 0; i<books.size(); i++){
            if (books.get(i).getId()==id){
                books.set(i,book);
                trueOrFalse = false;
            }
        }
        if (trueOrFalse){
            System.out.println("Book (id = "+id+") not found.");
        }
    }

    public static void removeBook(int id){
        Boolean trueOrFalse = true;

        for (int i = 0; i<books.size(); i++){
            if (books.get(i).getId()==id){
                books.remove(i);
                trueOrFalse = false;
                break;
            }
        }
        if (trueOrFalse){
            System.out.println("Book (id = "+id+") not found.");
        }
    }

    public static void insertBook(int index, int id, String title, String author, int year){
        Book book = new Book(id, title, author, year);
        Boolean trueOrFalse = true;


        for (int i = 0; i<books.size(); i++){
                if (books.get(i).getId()==index){
                    books.add(i,book);
                    trueOrFalse = false;
                    break;
                }
            }
        if (trueOrFalse){
            System.out.println("Book (id = "+index+") not found.");
        }
    }

}

class Book{


    private int id;
    private String title;
    private String author;
    private int year;


    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Book{id="+id+", title='"+title+"', author='"+author+"', year="+year+"}";
    }

    public Book(int id, String title, String author, int year){
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
    }


}
