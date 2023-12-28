package Contests.Week3;
import java.util.Scanner;

public class Con2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month (1-12):");
        int month = scanner.nextInt();

        while (month < 1 || month > 12) {
            System.out.println("Invalid month. Try again.");
            System.out.println("Enter a month (1-12):");
            month = scanner.nextInt();
        }

        System.out.println("Enter a year (1000 ~ ):");
        int year = scanner.nextInt();

        while (year < 1000) {
            System.out.println("Invalid year. Try again.");
            System.out.println("Enter a year (1000 ~ ):");
            year = scanner.nextInt();
        }


        // 해당 월의 일수 계산

        if (month != 2) {  //2월을 제외한 년도
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31 days");
            } else {
                System.out.println("30 days");
            }
        } else {    //2월의 경우
            if ((year % 4 == 0 && ((year % 100 != 0)||(year % 400 == 0)))) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        }


        scanner.close();
    }
}
