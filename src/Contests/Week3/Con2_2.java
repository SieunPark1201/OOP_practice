package Contests.Week3;
import java.util.Scanner;

public class Con2_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int int1 = scanner.nextInt();

        while (int1 <= 0) {
            System.out.println("Please enter a positive integer:");
            int1 = scanner.nextInt();
        }

        boolean isPrime = true;

        if (int1 > 1) {
            for (int num = 2; num * num <= int1; num++) {   // 제곱근까지만 계산해도 가능
                if (int1 % num == 0) {   // num으로 나누어떨어졌을 때
                    isPrime = false;   // 소수가 아니다
                    break;
                }
            }
        } else {   // int1 이 1일 때
            isPrime = false;
        }

        if (isPrime) {   // isPrime이 참일 때
            System.out.println(int1 + " is a prime number.");
        } else {
            System.out.println(int1 + " is not a prime number.");
        }

        scanner.close();

        }
    }
