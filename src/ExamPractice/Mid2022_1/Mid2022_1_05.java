package ExamPractice.Mid2022_1;
/*
Mid05: Library

DESCRIPTION:
도서관에서 책을 빌리는 행위를 나타내는 BorrowBook 이라는 class가 있다.
이 도서관에는 모두 10권의 책이 있으며, 각 책은 0부터 9까지의 번호로 불리운다.
책을 빌리고 싶을 때에는 BorrowBook object를 하나 생성한다.
Constructor의 argument는 빌리고 싶은 책의 번호를 나타낸다.
만일 빌리고 싶은 책을 누가 빌려간 상태이면 BorrowBook이 생성되는 순간 "번호 Fail" 이라고 출력된다.
만일 책을 빌릴 수 있는 상태라면 "번호 Success" 이라고 출력되며, 그 책은 다시 빌려가지 못한다.
주어진 output이 나오도록 class BorrowBook을 구현하여 프로그램을 완성하라.

 CONDITIONS:
 1) Code Template에 나와 있는 Main class는 절대 바꾸지 못한다.

INPUT: no input
OUTPUT:
3 Success
5 Success
6 Success
5 Fail
9 Success
3 Fail
How many trials? 6
How many trials? 6
How many available books? 6
How many available books? 6

CODE TEMPLATE:
public class Main {

	public static void main(String[] args) {
		BorrowBook b1 = new BorrowBook(3);
		BorrowBook b2 = new BorrowBook(5);
		BorrowBook b3 = new BorrowBook(6);
		BorrowBook b4 = new BorrowBook(5);
		BorrowBook b5 = new BorrowBook(9);
		BorrowBook b6 = new BorrowBook(3);

		System.out.println("How many trials? " + b1.getNumTrials());
		System.out.println("How many trials? " + BorrowBook.getNumTrials());
		System.out.println("How many available books? " + b5.getNumAvailableBooks());
		System.out.println("How many available books? " + BorrowBook.getNumAvailableBooks());
	}

}

// your code here for class BorrowBook
 */
public class Mid2022_1_05 {

    public static void main(String[] args) {
        BorrowBook b1 = new BorrowBook(3);
        BorrowBook b2 = new BorrowBook(5);
        BorrowBook b3 = new BorrowBook(6);
        BorrowBook b4 = new BorrowBook(5);
        BorrowBook b5 = new BorrowBook(9);
        BorrowBook b6 = new BorrowBook(3);

        System.out.println("How many trials? " + b1.getNumTrials());
        System.out.println("How many trials? " + BorrowBook.getNumTrials());
        System.out.println("How many available books? " + b5.getNumAvailableBooks());
        System.out.println("How many available books? " + BorrowBook.getNumAvailableBooks());
    }
}

class BorrowBook {
    private static int[] bookListBorrowed = {1,1,1,1,1,1,1,1,1,1};
    private int bookNum;
    private static int trials = 0;
    private static int available = 0;
    public BorrowBook(int bookNum){
        if (bookListBorrowed[bookNum]==1){
            System.out.println(bookNum + " Success");
            bookListBorrowed[bookNum]=0;
        } else {
            System.out.println(bookNum + " Fail");
        }
        trials++;

    }

    public static int getNumTrials() {
        return trials;
    }

    public static int getNumAvailableBooks() {
        for (int i = 0; i < 10; i++){
            if (bookListBorrowed[i]==1){
                available++;
            }
        }
        int temp = available;
        available = 0;
        return temp;
    }
}

