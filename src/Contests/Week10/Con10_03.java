package Contests.Week10;

import java.util.Scanner;

public class Con10_03 {
    public static void main(String[] args) throws Exception, failedException {


        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter initial account balance: ");
            double initialMon = scanner.nextDouble();

            System.out.println("Enter withdrawal amount: ");
            double withdrawalMon = scanner.nextDouble();

            double calculateNum = initialMon - withdrawalMon;

            if ( calculateNum < 0 ) {
                throw new failedException("Error: Insufficient funds!");
            }
            System.out.println("Current balance: " + calculateNum);

        } catch ( failedException e1 ) {
            try {
                System.out.println(e1.getMessage());
                throw new failedException("Withdrawal failed: Insufficient funds!");
            } catch (failedException e2) {
                System.out.println(e2.getMessage());

            }
        } finally {
            System.out.println("Account operation complete!");
        }

    }
}

class failedException extends Error {
    failedException(String message){
        super(message);
    }
}