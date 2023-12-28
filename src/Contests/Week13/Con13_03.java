package Contests.Week13;

public class Con13_03 {
    public static void main(String[] args) {
        AnimalSoundSimulator<Cat> catSimulator = new AnimalSoundSimulator<>(new Cat());
        catSimulator.simulateSound();

        AnimalSoundSimulator<Dog> dogSimulator = new AnimalSoundSimulator<>(new Dog());
        dogSimulator.simulateSound();

        AnimalSoundSimulator<Horse> horseSimulator = new AnimalSoundSimulator<>(new Horse());
        horseSimulator.simulateSound();
    }
}

class AnimalSoundSimulator<T extends Soundable>{
    private T animal;

    public AnimalSoundSimulator(T object){
        animal = object;
    }

    public void simulateSound(){
        animal.makeSound();
    }
}

interface Soundable{
    default void makeSound(){
    }
}

class Cat implements Soundable{
    String sound = "Meow";
    public Cat(){
    }
    public void makeSound(){
        System.out.println(sound);
    }
}

class Dog implements Soundable{
    String sound = "Woof";
    public Dog(){
    }
    public void makeSound(){
        System.out.println(sound);
    }

}

class Horse implements Soundable{
    String sound = "Neigh";
    public Horse(){
    }
    public void makeSound(){
        System.out.println(sound);
    }

}