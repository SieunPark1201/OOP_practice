package NotePractice.Sec5Prac;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter two numbers on a line");
        System.out.println("Place a comma between the numbers");
        System.out.println("Extra blank space is ok");
        String inputLine = keyboard.nextLine();

        String delemeters = ", ";
        StringTokenizer numberFactory = new StringTokenizer(inputLine,delemeters);

        String string1 = null;
        String string2 = null;
        if (numberFactory.countTokens()>=2){
            string1 = numberFactory.nextToken();
            string2 = numberFactory.nextToken();
        } else {
            System.out.println("Fatal Error");
            System.exit(0);
        }

        double number1 = Double.parseDouble(string1);
        double number2 = Double.parseDouble(string2);

        System.out.println("you input");
        System.out.println(number1 + " and " + number2);

    }

}
