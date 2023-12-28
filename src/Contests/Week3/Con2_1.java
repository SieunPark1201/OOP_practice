package Contests.Week3;

import java.util.Scanner;


public class Con2_1 {
    public static void main(String[] args){

        int volume;


//        System.out.println("volume of the items to be shipped: ");
        Scanner scanner = new Scanner(System.in);
        volume = scanner.nextInt();

        if (volume == 0) {
            System.out.println("16 = 0");
            System.out.println("12 = 0");
            System.out.println("8 = 0");
            System.out.println("4 = 0");
        }
        else {

            int shipping16 = volume / 16;
            int volume2 = volume - shipping16 * 16;
            int shipping12 = volume2 / 12;
            int volume3 = volume2 - shipping12 * 12;
            int shipping8 = volume3 / 8;
            int volume4 = volume3 - shipping8 * 8;
            int shipping4 =volume4 / 4;
            int volume5 = volume4 - shipping4 * 4;
            int shipping3 = volume5 / 3;
            int volume6 = volume5 - shipping3 * 3;
            int shipping2 = volume6 / 2;
            int volume7 = volume6 - shipping2 * 2;
            int shipping1 = volume7 / 1;

            int shipping4_final = shipping4 + shipping3 + shipping2 +shipping1;


            System.out.println("16 = "+shipping16);
            System.out.println("12 = "+shipping12);
            System.out.println("8 = "+shipping8);
            System.out.println("4 = "+shipping4_final);


        }

        scanner.close();
    }
}
