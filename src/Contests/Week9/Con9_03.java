package Contests.Week9;

public class Con9_03 {
        public static void main(String[] args) {
            Player footballer = new FootballPlayer("Lionel Messi", "Forward", "male");
            Player basketballer = new BasketballPlayer("LeBron James", "Forward", 38);

            footballer.displayInfo();
            basketballer.displayInfo();

        }
    }

abstract class Player {
    protected String name;
    protected String position;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public abstract void displayInfo();
}

class FootballPlayer extends Player {
    private String gender;

    public FootballPlayer(String name, String position, String gender) {
        super(name, position);
        this.gender = gender;
    }

    @Override
    public void displayInfo() {
        System.out.println("Football Player: " + name + ", Position: " + position + ", Gender: " + gender);
    }
}

class BasketballPlayer extends Player {
    private int age;

    public BasketballPlayer(String name, String position, int age) {
        super(name, position);
        this.age = age;
    }

    @Override
    public void displayInfo() {
        System.out.println("Basketball Player: " + name + ", Position: " + position + ", Age: " + age);
    }
}