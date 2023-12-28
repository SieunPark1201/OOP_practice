package Contests.Week8;

public class Con8_02 {
    public static void main(String[] args) {
        Book book = new Book("1984", "B001", "George Orwell");
        Magazine magazine = new Magazine("National Geographic", "M001", 200);

        book.printDetails();
        System.out.println();

        magazine.printDetails();
        System.out.println();

        Book bookWithoutAuthor = new Book("To Kill a Mockingbird", "B002");
        bookWithoutAuthor.printDetails();
    }
}

class LibraryItem{
    private String title;
    private String ID;

    public void setTitle(String title){
        this.title = title;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public void printDetails(){
        System.out.println("Title: " + title + ", ID: "+ ID);
    }
}

class Book extends LibraryItem{
    private String author;

    public Book(String title, String ID, String author){
        super();
        super.setTitle(title);
        super.setID(ID);
        this.author = author;
    }

    public Book(String title, String ID){
        super();
        super.setTitle(title);
        super.setID(ID);
        this.author = "Unknown";
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Author: "+author);
    }
}

class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, String ID, int issueNumber){
        super();
        super.setTitle(title);
        super.setID(ID);
        this.issueNumber = issueNumber;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Issue Number: "+issueNumber);
    }

}