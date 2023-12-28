package Contests.Week3;
import java.util.Random;

public class Con2_5 {
    public static void main(String[] args) {


        long seed = 10;
        Random randomGenerator = new Random(seed);

        int count = 0;

        for (int i = 0 ; i < 1000; i++) {

            int num1 = randomGenerator.nextInt(10)+21;
            int num2 = randomGenerator.nextInt(10)+21;
            int num3 = randomGenerator.nextInt(10)+21;

            if (num1 == 21 && ((num2 == 22 && num3 == 23) || (num2 ==23 && num3== 22))) {
                count++;
            } else if (num2 == 21 && ((num1 == 22 && num3 == 23) || (num1 ==23 && num3== 22))) {
                count++;
            } else if (num3 ==21 && ((num1 == 22 && num2 == 23) || (num1 ==23 && num2 == 22))) {
                count++;
            }
        }

        System.out.println(count+" wins in 1000 trials");
        System.out.println("The estimated probability of winning is "+count/1000.0);



    }
}
