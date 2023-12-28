package ExamPractice.Mid2022_1;
/*
Mid04: Array

DESCRIPTION:

다음 주어진 output이 나오도록 method fillData, showNumberMatrix, addNumberMatrix와 class Number를 구현하라.
Code template 에 사용되는 모든 Number의 2D array의 dimension은 항상 3 x 3 라 가정한다.
즉, 새로 구현하는 method들의 입력으로 주어지는 Number 2D array의 dimension도 항상 3 x 3 이라 가정한다.
Data로 주어지는 int의 2D array는 ragged array인데 row의 갯수는 항상 3이 보장되나
column의 갯수는 1 ~ 3 으로 가변적이다.
그러므로 fillData의 입력으로 주어지는 int 2D array의 첫번째 dimension은 항상 3이며, 두번째 dimension은 1 , 2, 3 중 하나이다.
Number class는 private int 만을 instance variable로 가지는 매우 간단한 class이다.

CONDITIONS:
1) code template의 // your code here .. 부분에만 코딩할 수 있다.
2) code template의 Main class의 main method는 절대 변경할 수 없다.

OUTPUT:
1 2 3
4 0 0
5 6 0

7 8 0
9 10 11
12 0 0

8 10 3
13 10 11
17 6 0

CODE TEMPLATE:

public class Main {

	public static void main(String[] args) {
		int[][] m1Data = {{1, 2, 3}, {4}, {5, 6}};
		int[][] m2Data = {{7, 8}, {9, 10, 11}, {12}};
		Number[][] m1 = new Number[3][3];
		Number[][] m2 = new Number[3][3];

		fillData(m1, m1Data);
		fillData(m2, m2Data);
		showNumberMatrix(m1);
		System.out.println();
		showNumberMatrix(m2);
		System.out.println();

		Number[][] m3 = addNumberMatrix(m1, m2);
		showNumberMatrix(m3);
	}

	// your code for fillData, showNumberMatrix, addNumberMatrix here

}

// your code for class Number

 */


public class Mid2022_1_04 {
    public static void main(String[] args) {
        int[][] m1Data = {{1, 2, 3}, {4}, {5, 6}};
        int[][] m2Data = {{7, 8}, {9, 10, 11}, {12}};
        Number[][] m1 = new Number[3][3];
        Number[][] m2 = new Number[3][3];

        fillData(m1, m1Data);
        fillData(m2, m2Data);
        showNumberMatrix(m1);
        System.out.println();
        showNumberMatrix(m2);
        System.out.println();

        Number[][] m3 = addNumberMatrix(m1, m2);
        showNumberMatrix(m3);
    }

    public static void fillData( Number[][] numbers, int[][] data){
        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                numbers[i][j] = new Number();
                if (j < data[i].length) {
                    numbers[i][j].setNum(data[i][j]);
                } else {
                    numbers[i][j].setNum(0);
                }
            }
        }
    }

    public static void showNumberMatrix(Number[][] numbers){
        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j].toString());
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static Number[][] addNumberMatrix(Number[][] numbers1, Number[][] numbers2){
        Number[][] number = new Number[3][3];
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++) {
                number[i][j] = new Number();
                number[i][j].setNum(numbers1[i][j].getNum()+ numbers2[i][j].getNum());
            }
        }
        return number;
    }

}

class Number{
    private int num = 0;

    public void setNum(int data){
        this.num = data;
    }

    public int getNum(){
        return num;
    }

    public String toString(){
        return num+"";
    }
}
