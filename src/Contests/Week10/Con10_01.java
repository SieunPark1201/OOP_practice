package Contests.Week10;

import java.util.Scanner;

public class Con10_01 {
    public static double calculate(double a, double b, String operator) throws UnsupportedOperatorException, ArithmeticException {
            if (operator.equals("+")){
               return (a+b);
            } else if (operator.equals("-")){
                return (a-b);
            } else if (operator.equals("*")){
                return (a*b);
            } else if (operator.equals("/")){
                if (b==0){ throw new ArithmeticException("Error: Division by zero is not allowed."); }
                return (a/b);
            } else {
                throw new UnsupportedOperatorException("Error: The operator '"+ operator + "' is not supported.");
            }

    }

    public static void main(String[] args) {
        String operator = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            double a = Double.parseDouble(scanner.next());
            System.out.println("Enter the second number: ");
            double b = Double.parseDouble(scanner.next());
            System.out.println("Enter the operator (+, -, *, /): ");
            operator = scanner.next();

            System.out.println("Result: " + calculate(a, b, operator));

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (UnsupportedOperatorException e1) {
            System.out.println(e1.getMessage());
        } catch (ArithmeticException e2) {
            System.out.println(e2.getMessage());
        }

    }


}

class UnsupportedOperatorException extends Exception{

    public UnsupportedOperatorException(String message){
        super(message);
    }


}