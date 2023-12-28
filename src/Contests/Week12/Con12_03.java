package Contests.Week12;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Con12_03 {
    public static void main(String[] args) {

        ZooManager manager = new ZooManager();

        Animal[] animal = new Animal[3];
        animal[0] = manager.getAnimal("lion");
        animal[1] = manager.getAnimal("elephant");
        animal[2] = manager.getAnimal("monkey");

        for (int i = 0; i < 3; i++) {
            manager.hearAnimalSound(animal[i]);
        }

    }
}

interface Animal {
    String makeSound();
}

class Lion implements Animal{

    @Override
    public String makeSound() {
        return "Roar";
    }
}

class Elephant implements Animal{

    @Override
    public String makeSound() {
        return "Trumpet";
    }
}

class Monkey implements Animal{

    @Override
    public String makeSound() {
        return "Chatter";
    }
}
class ZooManager {

    public Animal getAnimal(String animalName) {
        if (animalName.equals("lion")) {
            return new Lion();
        } else if (animalName.equals("monkey")) {
            return new Monkey();
        } else if (animalName.equals("elephant")) {
            return new Elephant();
        } else {
            return null;
        }
    }

    public void hearAnimalSound(Animal animal){
        System.out.println(animal.makeSound());
    }
}

