package Contests.Week8;

import javax.swing.*;

public class Con8_03 {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Sparrow", 0.025, 15);
        Bird bird2 = new Bird("Sparrow", 0.025, 15);
        Mammal mammal1 = new Mammal("Cat", 4.5, "Black");
        Mammal mammal2 = new Mammal("Cat", 4.5, "Gray");

        System.out.println(bird1);
        System.out.println(bird2);
        System.out.println("bird1 == bird2 ? " + bird1.equals(bird2));

        System.out.println(mammal1);
        System.out.println(mammal2);
        System.out.println("mamml1 == mammal2 ? " + mammal1.equals(mammal2));

        System.out.println("bird1 == mammal1 ? " + bird1.equals(mammal1));

    }
}

class Animal {
    protected String name;
    protected double weight;


    public String toString(){
        return "[Animal] name("+name+") weight("+weight+")";
    }
    public boolean equals(Animal animal){
        return this.toString().equals(animal.toString());
    }
}

class Bird extends Animal{
    protected int wingSpan;

    public Bird(String name, double weight, int wingSpan){
        super();
        super.name = name;
        super.weight = weight;
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString(){
        return "[Bird] wingSpan("+wingSpan+") "+super.toString();
    }

    public boolean equals(Bird bird){
        return bird.toString().equals(this.toString());
    }
}

class Mammal extends Animal{
    protected String furColor;

    public Mammal(String name, double weight, String color){
        super();
        super.name = name;
        super.weight = weight;
        this.furColor = color;
    }

    public String toString(){
        return "[Mammal] furColor("+furColor+") "+super.toString();
    }

    public boolean equals(Mammal mammal){
        return mammal.toString().equals(this.toString());
    }

}
