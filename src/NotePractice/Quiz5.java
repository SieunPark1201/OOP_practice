package NotePractice;

public class Quiz5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = test(a, a[4]);

        showArray(a);
    }

    static int[] test(int[] array, int x) {
        int[] newArray = array;
        for (int i = 0; i < array.length; i++) {
            newArray[i] *= 2;
        }
        x = 7;
        return newArray;
    }

    static void showArray(int[] array) {
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


//    다음 code에서 privacy leak을 고려할 때 올바르지 않은 line은?


class Class1 {

    private int x;
    private Class2 y;
    private int n;
    private double[] z;

    public Class1() {
        x = 2;
        y = new Class2();
        n = 3;
        z = new double[n];

    }

    public Class1(Class1 other){
        x = other.x;
        y = other.y;
        z = other.z;
        n = other.n;
    }

    public Class2 getY() {
        return y;
    }

    public double[] getZ() {
        return z;
    }
    public String toString() {
        String s = ""+ x + " "+y+" "+n;
        for (int i = 0; i < n; i++) {
            s += z[i] + " ";

        }
        return s;
    }
}

class Class2 {

    private int a;
    private int b;

    public Class2() {
        a = 11;
        b = 22;
    }

    public Class2(Class2 other){
        a = other.a;
        b = other.b;
    }

    public String toString() {
        return a+ " " + b;
    }
}
