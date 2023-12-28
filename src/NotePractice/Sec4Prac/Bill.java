package NotePractice.Sec4Prac;

import java.util.Scanner;

public class Bill {

    public static double Rate = 150.00;

    private int hours;
    private int minutes;
    private double fee;


    public void inputTimeWorked(){

        System.out.println("Enter number of full hours worked");
        System.out.println("followed by number of minutes:");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        minutes = scanner.nextInt();

    }


    public double computeFee(int hoursWorked, int minutesworked){
        minutesworked = hoursWorked * 60 + minutesworked;
        int quarterHours = minutesworked/15;

        return quarterHours*Rate;
    }

    public void updateFee(){
        fee = computeFee(hours,minutes);
    }



    public void outputBill() {
        System.out.println("Time worked:");
        System.out.println(hours+" hours and " + minutes + " minutes");
        System.out.println("Rate: "+ Rate + " per quarter hours");
        System.out.println("Amount due: " + fee);
    }


}
