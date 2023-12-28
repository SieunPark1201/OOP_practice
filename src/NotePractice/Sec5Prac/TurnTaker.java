package NotePractice.Sec5Prac;

import javax.swing.table.TableCellRenderer;

public class TurnTaker {
    private static int turn = 0;

    private int myTurn;
    private String name;

    public TurnTaker(String theName, int theTurn) {
        name = theName;
        if (theTurn>= 0) {
            myTurn = theTurn;
        } else {
            System.out.println("Fatal error");
            System.exit(0);
        }
    }

    public String getName() { return name; }


    public static int getTurn() {
        turn++;
        return turn;
    }

    public boolean isMyTurn() { return (turn == myTurn); }
}


class StaticDemo{
    public static void main(String[] args) {
        TurnTaker lover1 = new TurnTaker("romeo", 1);
        TurnTaker lover2 = new TurnTaker("juliet", 3);

        for (int i = 1; i < 5; i++) {
            System.out.println("Turn"+ TurnTaker.getTurn());
            if (lover1.isMyTurn())
                System.out.println("Love from "+lover1.getName());
            if (lover2.isMyTurn())
                System.out.println("Love From "+lover2.getName());
        }
    }
}