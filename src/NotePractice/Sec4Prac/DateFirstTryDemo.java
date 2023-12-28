package NotePractice.Sec4Prac;

public class DateFirstTryDemo {
    public static void main(String[] args) {
        DateFirstTry date1, date2;
        date1 = new DateFirstTry();
        date2 = new DateFirstTry();

        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;

        System.out.println("date1: ");
        date1.writeOutput();

    }
}
