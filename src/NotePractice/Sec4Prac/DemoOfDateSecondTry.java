package NotePractice.Sec4Prac;

public class DemoOfDateSecondTry {
    public static void main(String[] args){

        DateSecondTry dateSecondTry = new DateSecondTry();
        dateSecondTry.readInput();

        int dayNumber = dateSecondTry.getDay();
        System.out.println("That's the " + dayNumber + "th day of the month");
    }
}
