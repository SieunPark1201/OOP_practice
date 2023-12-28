package NotePractice;

public class Quiz4 {
//    private String name;
//    private int age;
//    static String planet = "Earth";
//
//    public static void intro() {
//        System.out.println("imlivingon"+planet+ ".");
//    }

    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test(5);
        System.out.println(a);
        System.out.println(b);
        a = b;
        System.out.println(a);
        a.setX(3);
        System.out.println(b);

    }

}

class Test{
    private int x;
    public Test() {x = 0;};
    public Test(int x) {this.x = x;}
    public void setX(int x) { this.x = x;}
    public String toString() {return ""+x;}
}
