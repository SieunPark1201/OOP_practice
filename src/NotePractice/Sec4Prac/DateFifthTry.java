package NotePractice.Sec4Prac;

import java.awt.*;
import java.util.Scanner;
public class DateFifthTry {

    private String month;
    private int day;
    private int year;




    public void writeOutput(){
        System.out.println(month + " " + day + ", " + year);

    }



    public void ReadInput() {
        boolean tryAgain = true;
        Scanner scanner = new Scanner(System.in);
        while (tryAgain) {
            System.out.println("enter month, day, and year");
            System.out.println("as three integers:");
            System.out.println("** do not use commas or other punctuations");
            int monthInput = scanner.nextInt();
            int dayInput = scanner.nextInt();
            int yearInput = scanner.nextInt();

            if (dateOK(monthInput, dayInput, yearInput)) {
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            } else {
                System.out.println("Illegal date. Reenter input.");

            }
        }
    }



        public void setDate (int month, int day, int year) {

            if (dateOK(month, day, year)) {
                this.month = monthToString(month);
                this.day = day;
                this.year = year;

            } else {
                System.out.println("Fatal error");
                System.exit(0);
            }
        }

        public void setMonth(int monthNum) {
            if ((monthNum <= 0) || (monthNum > 12)) {
                System.out.println("Fatal error");
                System.exit(0);
            } else {
                month = monthToString(monthNum);
            }
            }




    public boolean dateOK(int monthInt, int dayInt, int yearInt){
        return (monthInt >=1);
    }






    private String monthToString(int monthNum) {
        switch (monthNum) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }



}

}