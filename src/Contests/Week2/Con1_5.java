package Contests.Week2;

public class Con1_5 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 2;
        int d = 3;

        System.out.println("Given values of the variables: " +a+", "+b+", "+c+", "+d);

        int result = a++ + --b + --c + d++;

        System.out.println("Result of the expression: "+result);
        System.out.println("Final values of the variables: " +a+", "+b+", "+c+", "+d);
    }
    }
