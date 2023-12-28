package Contests.Week7;

public class Con7_03 {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("The Great Gatsby", 8);
        books[1] = new Book("To Kill a Mockingbird", 5);
        books[2] = new Book("1984", 6);
        books[3] = new Book("Moby Dick", 2);
        books[4] = new Book("Gone with the wind", 4);

        Sorting.sort(books);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}

class Book{
    private String bookTitle;
    private int ISBN;

    public Book(String bookTitle, int ISBN){
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
    }

    public int getISBN(){
        return ISBN;
    }

    public String toString(){
        return "[BOOK] ISBN("+ISBN+") Title(" + bookTitle+")";
    }
}

class Sorting {
    public static void sort(Book[] books){

        for (int i = 0; i < books.length ; i++){
                for (int j = i; j > 0 ; j--) {
                    if (books[j-1].getISBN()> books[j].getISBN()){
                        Book temp2 = books[j-1];
                        books[j-1] = books[j];
                        books[j] = temp2;
                    }
                }

                for (int j = 0; j < books.length; j++){
                    System.out.print(books[j].getISBN());
                    if ( j < books.length -1 ) {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}
