package Contests.Week11;

public class Con11_01 {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };
        int[][] matrix4 = {
                { }
        };
        int[][] matrix5 = {
                {1, 2}
        };

        spiralTraversal(matrix1);
        System.out.println();
        spiralTraversal(matrix2);
        System.out.println();
        spiralTraversal(matrix3);
        System.out.println();
        spiralTraversal(matrix4);
        System.out.println();
        spiralTraversal(matrix5);

    }

    public static void spiralTraversal(int[][] matrix){
//        if (matrix.length <= 0) {
//            return;
//        } else {

            for (int i = 0; i < matrix[0].length; i++){
                System.out.print(matrix[0][i]+" ");
            }

            for (int i = 1; i < matrix.length; i++){
                System.out.print(matrix[i][matrix[i].length-1]+" ");
            }

            if (matrix.length!=1) {
                for (int i = matrix[matrix.length - 1].length - 2; i >= 0; i--) {
                    System.out.print(matrix[matrix.length - 1][i] + " ");
                }

                if (matrix[0].length!=1) {
                    for (int i = matrix.length - 2; i > 0; i--) {
                        System.out.print(matrix[i][0] + " ");
                    }
                }
            }


            if (matrix.length-2<=0 || matrix[0].length-2<=0){
                return;
            }

            int[][] matrix2 = new int[matrix.length-2][matrix[0].length-2];
            for (int i = 0; i < matrix2.length; i++){
                for (int j = 0; j < matrix2[0].length; j++){
                    matrix2[i][j] = matrix[i+1][j+1];
                }

            }

            spiralTraversal(matrix2);

//        }

    }

}


