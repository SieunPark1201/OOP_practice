package Contests.Week3;
import java.util.Scanner;

public class Con2_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the diamond (must be an odd number):");
        int num = scanner.nextInt();

        while (num % 2 == 0 || num <= 0) {
            System.out.println("Please enter a positive odd integer:");
            num = scanner.nextInt();
        }

        for (int j = 1; j <= (num + 1) / 2; j++) {
            String space = "";
            String star = "";

            // 공백 출력 로직 1/2
            for (int i = (num + 1) / 2 - j; i > 0; i--) {
                space = space + " ";
            }

            // 별 출력 로직 1/2
            for (int i = 1; i <= j; i++) {
                star = star + "*";
            }
            for (int i = 1; i < j; i++) {
                star = star + "*";
            }

            System.out.println(space + star);
        }

        for (int j = 1; j < (num + 1) / 2; j++) {
            String space = "";
            String star = "";

//            공백 출력 로직 2/2
            for (int i = 0; i < j; i++) {
                space = space + " ";
            }

            // 별 출력 로직 2/2
            for (int i =(num + 1) / 2 ; i > j; i-- ) {
                star = star + "*";
            }
            for (int i = (num + 1) / 2; i > j+1 ; i--) {
                star = star + "*";
            }

            System.out.println(space + star);

        }
    }
}
