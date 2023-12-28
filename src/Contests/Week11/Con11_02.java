package Contests.Week11;

import java.util.Scanner;

public class Con11_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        findPrime(min,max,2,true);

    }

    public static void findPrime(int min, int max, int n,boolean trueOrFalse){

        if (min > max) {
            return;
        }

        if (min == n) {

            if (trueOrFalse) {
                System.out.print(min);
                System.out.println();
            }

            min++;
            trueOrFalse = true;
            findPrime(min, max, 2, trueOrFalse);

        } else {

            if (min % n == 0) {
                trueOrFalse = false;
                n = min;
                findPrime(min,max,n,trueOrFalse);

            } else {
                findPrime(min, max, n+1, trueOrFalse);
            }

        }



    }

}
