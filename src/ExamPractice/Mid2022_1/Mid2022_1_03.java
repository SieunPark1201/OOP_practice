package ExamPractice.Mid2022_1;
/*
Mid03: Class

DESCRIPTION:
다음 주어진 output이 나오도록 class Address와 class Building을 구현하라.

CONDITIONS:
1) Code Template에 나와 있는 Main class는 절대 바꾸지 못한다.

INPUT: no input
OUTPUT:
[ADDR] city(nocity) road(noroad) num(0)
[ADDR] city(Seoul) road(Jong-ro) num(32)
[ADDR] city(Busan) road(Gunam-ro) num(45)

[BUILDING] name(noname) year(0) addr([ADDR] city(nocity) road(noroad) num(0))
[BUILDING] name(Heaven) year(1995) addr([ADDR] city(Seoul) road(Jong-ro) num(32))
[BUILDING] name(Angel) year(2008) addr([ADDR] city(Busan) road(Gunam-ro) num(45))

[ADDR] city(Sejong) road(One-ro) num(177)
[ADDR] city(Seoul) road(Jong-ro) num(32)
[ADDR] city(Busan) road(Gunam-ro) num(45)

[BUILDING] name(Joy) year(2012) addr([ADDR] city(nocity) road(noroad) num(0))
[BUILDING] name(Heaven) year(1995) addr([ADDR] city(Seoul) road(Jong-ro) num(32))
[BUILDING] name(Angel) year(2008) addr([ADDR] city(Busan) road(Gunam-ro) num(45))

[ADDR] city(Seoul) road(Jong-ro) num(32)
a4 == a2 ? true
a4 == a1 ? false
a4 == b1 ? false
a4 == a1 ? true

HINT:
1) privacy leak 이 생기지 않도록 유의한다.

CODE TEMPLATE:

public class Main {

	public static void main(String[] args) {
		Address a1 = new Address();
		Address a2 = new Address("Seoul", "Jong-ro", 32);  // city, road, number
		Address a3 = new Address("Busan", "Gunam-ro", 45);
		Address a4;
		Building b1 = new Building();
		Building b2 = new Building("Heaven", 1995, a2); // name, year, address
		Building b3 = new Building("Angel", 2008, a3);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println();

		b1.set("Joy", 2012, a1);
		a1.set("Sejong",  "One-ro", 177);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println();

		a4 = new Address(a2);

		System.out.println(a4);
		System.out.println();
		System.out.println("a4 == a2 ? " + a4.equals(a2));
		System.out.println("a4 == a1 ? " + a4.equals(a1));
		System.out.println("a4 == b1 ? " + a4.equals(b1));

		a1.set("Seoul", "Jong-ro", 32);
		System.out.println("a4 == a1 ? " + a4.equals(a1));
	}

}


 */
public class Mid2022_1_03 {
    public static void main(String[] args) {
        Address a1 = new Address();
        Address a2 = new Address("Seoul", "Jong-ro", 32);  // city, road, number
        Address a3 = new Address("Busan", "Gunam-ro", 45);
        Address a4;
        Building b1 = new Building();
        Building b2 = new Building("Heaven", 1995, a2); // name, year, address
        Building b3 = new Building("Angel", 2008, a3);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        b1.set("Joy", 2012, a1);
        a1.set("Sejong",  "One-ro", 177);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        a4 = new Address(a2);

        System.out.println(a4);
        System.out.println();
        System.out.println("a4 == a2 ? " + a4.equals(a2));
        System.out.println("a4 == a1 ? " + a4.equals(a1));
        System.out.println("a4 == b1 ? " + a4.equals(b1));

        a1.set("Seoul", "Jong-ro", 32);
        System.out.println("a4 == a1 ? " + a4.equals(a1));
    }

}


class Address{
    private String city;
    private String road;
    private int number;

    public Address() {
        this.city="nocity";
        this.number = 0;
        this.road = "noroad";

    }

    public Address(String city, String road, int number){
        this.city = city;
        this.number = number;
        this.road = road;
    }

    public Address(Address address){
        Address copy = new Address();
        copy = address;
        this.road = copy.road;
        this.city = copy.city;
        this.number =copy.number;

    }

    public void set(String city, String road, int number){
        this.city = city;
        this.number = number;
        this.road = road;
    }

    public boolean equals(Address address) {
        return this.toString().equals(address.toString());
    }

    public String toString(){
        return "[ADDR] city("+city+") road("+ road+") num("+number+")";
    }

}

class Building {
    private String name;
    private int year;
    private Address address;

    public Building(){
        this.name="noname";
        this.year=0;
        this.address=new Address();
    }

    public Building(String name, int year, Address address){
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public void set(String name, int year, Address address){
        this.name=name;
        this.year=year;
        this.address=address;
    }

    public boolean equals(Building building){
        return this.address.toString().equals(building.address.toString());

    }

    public String toString(){
        return "[BUILDING] name("+ name+") year("+year+") addr("+address+")";
    }
}