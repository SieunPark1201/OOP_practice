package ExamPractice.Mid2022_1;
/*
Mid06: Inheritance

DESCRIPTION:
Parent class는 protected int x 를 instance variable로 가진다.
Parent의 data method는 x값을 return한다.
Parent의 compute method는 주어진 dx 값을 x 에 곱해 return 한다.

Child class는 Parent class의 child 이다.
Child class는 inherit 된  것 이외에 protected int y를 instance variable로 가진다.
Child class의 data method는 x + y 를 return한다.
Child class의 compute method는 dx, dy를 argument로 받아 x * dx + y * dy 를 return한다.

주어진 output이 나오도록 class Parent와 class Child를 완성하라.

CONDITIONS:
1) overloading, overriding 이 필요한 것은 하되, 필요 없는 것은 하지 말아야 한다.
2) Child의 toString에서는 Parent의 toString을 반드시 이용해야 한다.
3) [중요] equals는 Parent에만 존재하며, Child에서 다시 overriding될 수 없다.
4) [중요] equals는 Object type의 argument를 받아야 한다.
5) code template의 Main class는 절대 변경할 수 없다.

OUTPUT:
p1 = x(1)
p2 = x(3)
c1 = x(1) y(2)
c2 = x(1) y(5)
c3 = x(7) y(8)
p2.data() = 3
c3.data() = 15
p2.compute(5) = 15
c3.compute(2, 3) = 38
p2 == p3 ? true
p1 == p2 ? false
p2 == c2 ? false
c2 == c3 ? false
c3 == c4 ? true
c3 == p3 ? false

CODE TEMPLATE:

public class Main {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Parent(3);
		Parent p3 = new Parent(3);
		Child c1 = new Child();
		Child c2 = new Child(5);
		Child c3 = new Child(7, 8);
		Child c4 = new Child(7, 8);

		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		System.out.println("p2.data() = " + p2.data());
		System.out.println("c3.data() = " + c3.data());
		System.out.println("p2.compute(5) = " + p2.compute(5));
		System.out.println("c3.compute(2, 3) = " + c3.compute(2, 3));

		System.out.println("p2 == p3 ? " + p2.equals(p3));
		System.out.println("p1 == p2 ? " + p1.equals(p2));
		System.out.println("p2 == c2 ? " + p2.equals(c2));
		System.out.println("c2 == c3 ? " + c2.equals(c3));
		System.out.println("c3 == c4 ? " + c3.equals(c4));
		System.out.println("c3 == p3 ? " + c3.equals(p3));
	}
}

*/
public class Mid2022_1_06 {

    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Parent(3);
        Parent p3 = new Parent(3);
        Child c1 = new Child();
        Child c2 = new Child(5);
        Child c3 = new Child(7, 8);
        Child c4 = new Child(7, 8);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("p2.data() = " + p2.data());
        System.out.println("c3.data() = " + c3.data());
        System.out.println("p2.compute(5) = " + p2.compute(5));
        System.out.println("c3.compute(2, 3) = " + c3.compute(2, 3));

        System.out.println("p2 == p3 ? " + p2.equals(p3));
        System.out.println("p1 == p2 ? " + p1.equals(p2));
        System.out.println("p2 == c2 ? " + p2.equals(c2));
        System.out.println("c2 == c3 ? " + c2.equals(c3));
        System.out.println("c3 == c4 ? " + c3.equals(c4));
        System.out.println("c3 == p3 ? " + c3.equals(p3));
    }
}

class Parent {
    protected int x;

    public Parent(){
        this.x = 1;
    }

    public Parent(int n){
        this.x = n;
    }

    public int data() {
        return x;
    }
    public int compute(int num){
//        x *= num;
        return x*num;
    }

    public String toString(){
        return "x("+x+")";
    }

    public boolean equals(Object object){
        return this.toString().equals(object.toString());
    }

}

class Child extends Parent{
    protected int y;

    public Child(){
        super();
        super.x = 1;
        this.y = 2;
    }

    public Child(int y){
        super();
        super.x = 1;
        this.y = y;
    }

    public Child(int x, int y){
        super();
        super.x= x;
        this.y = y;
    }

    public int data(){
        return x+y;
    }

    public int compute(int x, int y) {
//        super.x = this.x * x;
//        this.y = this.y * y;
        return super.x * x + this.y * y;
    }

    public String toString(){
        return super.toString()+" y("+y+")";
    }
}
