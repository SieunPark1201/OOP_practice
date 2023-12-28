package Contests.Week9;

public class Con9_01 {
    public static void main(String[] args) {
                Animal dog = new Dog("Buddy", "Golden Retriever");
                Animal cat = new Cat("Whiskers", "White");
                Animal bird = new Bird("Tweety", true);

                printAnimalSound(dog);
                printAnimalSound(cat);
                printAnimalSound(bird);
            }

            public static void printAnimalSound(Animal animal) {
                System.out.println(animal.getName() + " says: " + animal.sound());
            }
        }

        abstract class Animal {
            private String name;

            public Animal(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public abstract String sound();
        }

        class Dog extends Animal {
            private String breed;

            public Dog(String name, String breed) {
                super(name);
                this.breed = breed;
            }

            @Override
            public String sound() {
                return "Woof! Woof!";
            }
        }

        class Cat extends Animal {
            private String color;

            public Cat(String name, String color) {
                super(name);
                this.color = color;
            }

            @Override
            public String sound() {
                return "Meow! Meow!";
            }
        }

        class Bird extends Animal {
            private boolean canFly;

            public Bird(String name, boolean canFly) {
                super(name);
                this.canFly = canFly;
            }

            @Override
            public String sound() {
                return "Chirp! Chirp!";
            }
        }
