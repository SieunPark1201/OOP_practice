package Contests.Week6;

public class Con_02 {

    public static void main(String[] args) {

        Date date1 = new Date(10, 7);        // July 10th
        Person person1 = new Person(date1);  // date1 as birthDate of person1

        System.out.println("person1's birthDate: " + person1.getBirthDate());

        // using getBirthDate()
        Date date2 = person1.getBirthDate();  // get person1's date into date2
        date2.setDay(20); // Modifying the day of the date2

        Person person2 = new Person(date2);  // date2 as birthDate of person2

        System.out.println("person1's birthDate: " + person1.getBirthDate());
        System.out.println("person2's birthDate: " + person2.getBirthDate());

        System.out.println();

        date1 = new Date(10, 7);        // July 10th again
        person1 = new Person(date1);    // date1 as birthDate of person1 again

        System.out.println("person1's birthDate: " + person1.getBirthDate());

        // using getBirthDate2()
        date2 = person1.getBirthDate2();  // get person1's date into date2
        date2.setDay(20); // Modifying the day of the date2

        person2 = new Person(date2);  // date2 as birthDate of person2

        System.out.println("person1's birthDate: " + person1.getBirthDate());
        System.out.println("person2's birthDate: " + person2.getBirthDate());

    }
}

class Date {
    private int day;
    private int month;

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        int day = this.day;
        return day;
    }

    public int getMonth() {
        int month = this.month;
        return month;
    }

    public String toString(){
        return day + "/" + month;
    }


}

class Person {

    private Date date;

    public Person(Date date){
        this.date = date;
    }


    public Date getBirthDate() {
        return this.date;
    }

    public Date getBirthDate2() {
        Date date1 = new Date(date.getDay(),date.getMonth());
        return date1;
    }

    }


