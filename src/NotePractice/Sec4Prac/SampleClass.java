package NotePractice.Sec4Prac;

public class SampleClass {
    public int x;
    public void sayhello(int y) {
        System.out.println("Hello"+x+" "+ y);
    }

    public int squareX() {
        sayhello(x+1);
        return x*x;
    }
}
