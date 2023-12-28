//package NotePractice.Sec6Prac;
//
//import java.util.Scanner;
//
//public class GolfScores {
//    public static final int MAX_NUMBER_SCORES = 10;

//    public static void main(String[] args) {
//        double[] score = new double[MAX_NUMBER_SCORES];
//        int numberUsed = 0;
//
//        System.out.println("This program reads golf scores and shows");
//        System.out.println("how much each differs from the average");
//        System.out.println("Enter golf scores:");
//        numberUsed = fillArray(score);
////        showDifference(score, numberUsed);
//    }

//    public static int fillArray(double[] a) {
//        System.out.println("Enter up to " + a.length + " nonnegative numbers");
//        System.out.println("Mark the end of the list with a negative number");
//
//        Scanner scanner = new Scanner(System.in);
//
//        double next;
//        int index = 0;
//        next = scanner.nextDouble();
//
//        while ((next >= 0) && (index < a.length)) {
//            a[index] = next;
//            index++;
//            next = scanner.nextDouble();
//        }
//
////        if (
//    }}
//
