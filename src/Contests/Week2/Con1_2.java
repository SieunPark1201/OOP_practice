package Contests.Week2;

public class Con1_2 {
    public static void main(String[] args) {

        String str1 = "Hello World, I'm finally* here!";




        String str2 = str1.replace(" ", "");
        int int1 = str1.length()-str2.length() + 1;

        System.out.println(str1);
        System.out.println("Number of words: "+int1);



    }
}
