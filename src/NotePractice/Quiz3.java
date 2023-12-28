package NotePractice;

public class Quiz3 {

    public static void main(String[] args){
// 1번
//      String str1 = "Seoul";
//
//      String str2 = str1;
//
//      String str3 = new String("Seoul");
//
//      String str4 = new String("Seoul");
//
//      String str5 = str3;
//
//
//        System.out.println(str2.equals(str4));
//        System.out.println(str3.equals("Seoul"));
//        System.out.println(str5 == str3);
//        System.out.println(str3 == str4);
//        System.out.println(str1.equals(str2));
//
// 2번
//        Test a = new Test();
//        a.x = 5;
//        a.name = "First";
//        System.out.println(a);

//// 3번
//        Number a = new Number();
//        System.out.print(a.x + " ");
//        a.setX(5);
//        System.out.println(a.x);







//        int x = 3;
//        increase(x);
//
//
//    }
//
//    static int increase(int x) {
//        x = x + 1;
//        System.out.println(x);
//        return x;

        Number a = new Number();
        a.setX(7);
        System.out.println(a.x);
        Number b = new Number(5);
        System.out.println(a.x);






    }
}

// 2번
//
//class Test {
//    int x;
//    String name;
//    public String toString() {
//        return "Test "+name;
//    }
//}


//// 3번
//class Number {
//    int x;
//    void setX(int x){
//        this.x = x;
//    }
//}


class Number {
    int x;
    Number() {
        this.x = 0;
    } // 기본생성자

    Number(int x) {
        this.x = x;
    }
    void setX(int x) {
        this.x = x;
    }
}