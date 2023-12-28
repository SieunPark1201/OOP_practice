package Contests.Week12;

public class Con12_01 {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new Book("New World", "Tom Baker", 1993, "Fiction"));
        library.addBook(new Book("Way to Seoul", "Sunmi Kim", 2015, "NonFiction"));
        library.addBook(new Book("Away from me", "Jane Power", 2003, "Fiction"));
        library.addBook(new Book("General Lee", "Mi-Wook Jang", 1982, "Biography"));

        System.out.println("---------------------------------------------------------------");
        library.printBooks();

        library.sortBooksByTitle();
        System.out.println("---------------------------------------------------------------");
        library.printBooks();

        System.out.println("---------------------------------------------------------------");
        library.removeBook("Away from me");
        System.out.println("---------------------------------------------------------------");
        library.printBooks();

        System.out.println("---------------------------------------------------------------");
        library.searchByTitle("General Lee");

        library.addBook(new Book("Coach Momo", "Sang-Bin Woo", 1982, "Biography"));
        library.addBook(new Book("Flowing like a liver", "John Hodgins", 1933, "Fiction"));
        System.out.println("---------------------------------------------------------------");
        library.printBooks();

        library.sortBooksByTitle();
        System.out.println("---------------------------------------------------------------");
        library.printBooks();

        System.out.println("---------------------------------------------------------------");
        library.searchByTitle("Away from me");

        System.out.println("---------------------------------------------------------------");
        library.removeBook("Don't touch my head");

    }
}


class Library{
    private Book[] books;
    private static int index = -1;

    public Library(int num){
        books = new Book[num];
    }

    public void addBook(Book book){
        index++;
        books[index]=book;
    }

    public void printBooks(){
        for(int i = 0; i <= index; i++) {
            System.out.println(books[i]);
        }
    }

    public void sortBooksByTitle(){

         for (int i = 0; i <= index; i++) {
             for (int j = index; j > i; j--) {
                 if (books[j].compareTo(books[j - 1]) < 0) {
                     Book temp = books[j];
                     books[j] = books[j - 1];
                     books[j - 1] = temp;
                 }
             }
         }
    }

    public void removeBook(String title){
        boolean success = false;
        int targetNum=-1;

        for(int i = 0 ; i <= index; i++){
            if (books[i].getTitle().equals(title)){
                targetNum = i;
                books[i] = null;
                success = true;
            }
        }

        if(success) {
            for(int i = targetNum; i < index; i++){
                books[i] = books[i+1];
            }
            books[index] = null;
            index--;
            System.out.println("Book '"+title+"' removed successfully.");
        } else {
            System.out.println("Book '"+title+"' not found.");
        }
    }

    public void searchByTitle(String title){
        boolean success = false;
        for (int i = 0; i <= index; i++){
            if(books[i].getTitle().equals(title)){
                success = true;
                System.out.println(books[i].toString());
            }
        }
        if (!success) {
            System.out.println("No books found with the given title: '"+title+"'");

        }
    }

}

class Book implements Comparable{

    private String title;
    private String author;
    private int year;
    private String genre;

    public Book(String title, String author, int year, String genre){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }


    @Override
    public int compareTo(Object o) {
        Book otherBook = (Book) o;
        return this.getTitle().compareTo(otherBook.getTitle());
    }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return "Book{title='"+title+"', author='"+author+"', year="+year+", genre='"+genre+"'}";
    }
}