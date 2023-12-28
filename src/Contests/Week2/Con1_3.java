package Contests.Week2;

public class Con1_3 {
    public static void main(String[] args) {

        double radius1 = 5.0;
        final double PI = 3.14159;

        double area = radius1 * radius1 * PI;
        double circum = radius1 * 2 * PI;


        System.out.println("The area of the circle with radius " + radius1 + " is " + area);
        System.out.println("The circumference of the circle with radius " + radius1 + " is " + circum);
    }
}
