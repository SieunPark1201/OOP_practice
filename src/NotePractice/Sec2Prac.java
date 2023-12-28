package NotePractice;


import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Sec2Prac {
    public static void main(String[] args) {

////        printf
//
//        double price = 18.8;
//        System.out.print("dollar");
//        System.out.printf("%6.2f",price);
//
//        System.out.println(" each");
//
//        double value = 12.123;
//        System.out.printf("Start%8.2fEnd%n", value);
//        System.out.printf("Start%-8.2fEnd%n", value);
//
//        int num = 3;
//        String name = "magic apple";
//
//        System.out.printf("dollar %6.2f %d for each %s. %n", price, num, name);
//
//        String astring = "abc";
//
//        System.out.println("String output:");
//        System.out.printf("Start%sEnd %n", astring);
//        System.out.printf("Start%5sEnd %n", astring);
////        System.out.println("Start%2sEnd", astring);
//
//        char oneChar = 'Z';
//        System.out.printf("S%cE %n", oneChar);
//        System.out.printf("S%6cE %n", oneChar);
//
//
//        double d = 1235.12356118;
//
//        System.out.printf("-%f-%n", d);
//        System.out.printf("-%10f-%n", d);
//        System.out.printf("-%10.2f-%n", d);
//        System.out.printf("-%.3f-%n", d);
//        System.out.printf("-%e-%n", d);
//        System.out.printf("-%12.5e-%n",d);





////        numberformat class : outputs amounts of money
//
//        System.out.println("Default location: ");
//        NumberFormat moneyFormater = NumberFormat.getCurrencyInstance();
//
//
//        System.out.println(moneyFormater.format(12.88));
//        System.out.println(moneyFormater.format(112.22222222));
//        System.out.println(moneyFormater.format(12));
//
//        NumberFormat numberFormater2 = NumberFormat.getCurrencyInstance(Locale.US);
//
//        System.out.println(numberFormater2.format(12.11));
//        System.out.println(numberFormater2.format(122.1123));
//        System.out.println(numberFormater2.format(12));
//
//
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.KOREA);




////        2. Console Input Using Scanner
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter the number of pods followed by.");
//        System.out.println("the number of peas in a pad: ");
//        int numberOfPods = keyboard.nextInt();
//        int peasPerPod = keyboard.nextInt();
//
//        int total = numberOfPods * peasPerPod;
//
//        System.out.println(numberOfPods + " pods and " );
//        System.out.println(peasPerPod + " peas per pod.");
//        System.out.println("The total number of peas = "+ total);
//
//        int i1, i2;
//        Scanner scannerObject2 = new Scanner(System.in);
//        System.out.println("enter two whole numbers");
//        System.out.println("seperated by one or more spaces");
//
//        i1 = scannerObject2.nextInt();
//        i2 = scannerObject2.nextInt();
//        System.out.println("you entered " + i1 + " and " + i2);
//
//        double i3;
//        i3 = scannerObject2.nextDouble();
//
//        scannerObject2.next(); // <- 한 단어만 읽음
//        scannerObject2.useDelimiter("-");



////        3. Introduction to File Input
//        Scanner fileIn = null;
//
//        try {
//            fileIn = new Scanner(new FileInputStream("player.txt"));
//        } catch (FileNotFoundException e){
//            System.out.println("file not found");
//            System.exit(0);
//        }
//
//        int highscore;
//        String name;
//
//        System.out.println("Text left to read? "+ fileIn.hasNextLine());
//        highscore=fileIn.nextInt();
//        fileIn.nextLine();    // \n 제거
//        name=fileIn.nextLine();
//
//        System.out.println(name);
//        System.out.println(highscore);
//
//        System.out.println("Text left to read? "+ fileIn.hasNextLine());
//
//        fileIn.close();
//
//
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileOutputStream("stuff.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file stuff.txt.");
            System.exit(0);
        }

        output.println("The quick brown fox");
        output.println("jumps over the lazy dog");

        output.close();

        System.out.println("End of program");



//        출력
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileInputStream("player.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("file not found error");
            System.exit(0);
        }

        System.out.println("is there next line? "+scanner.hasNextLine());
        int score = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println(score);
        System.out.println(name);
        System.out.println("is ther next line? "+scanner.hasNextLine());



//        입력

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileOutputStream("animal.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening animal.txt");
            System.exit(0);
        }

        writer.println("dog");
        writer.println("cat");

        writer.close();

        System.out.println("End!");





    }
}
