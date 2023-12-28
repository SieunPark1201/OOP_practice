package Contests.Week10;

import java.util.Scanner;

public class Con10_02 {
    public static void main(String[] args) throws NumberFormatException {

            Scanner scanner = new Scanner(System.in);
            double sum = 0;
            double num = 0;
            String stringNum;
            do {
                System.out.println("Enter a number (type 'exit' to quit): ");
                stringNum = scanner.next();

                if ( stringNum.equals("exit") ) {
                    break;
                } else {
                    try {
                        num = Double.parseDouble(stringNum);
                        sum += num;

                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
            } while (! stringNum.equals("exit") );
        System.out.println("Total sum of entered numbers: "+sum);

    }
}
