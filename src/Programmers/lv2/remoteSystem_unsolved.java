package Programmers.lv2;

public class remoteSystem_unsolved {
    public static void main(String[] args) {

        int[][] targettt = new int[7][2];
        targettt[0][0]=4;
        targettt[0][1]=5;
        targettt[1][0]=4;
        targettt[1][1]=8;
        targettt[2][0]=10;
        targettt[2][1]=14;
        targettt[3][0]=11;
        targettt[3][1]=13;
        targettt[4][0]=5;
        targettt[4][1]=12;
        targettt[5][0]=3;
        targettt[5][1]=7;
        targettt[6][0]=1;
        targettt[6][1]=4;

        System.out.println(solution(targettt));


    }

    public static int solution(int[][] targets) {
        int answer = 0;



        // 시작점을 기준으로 정렬


















//        // 최소한도로 쏘게끔 만드는 알고리즘이 뭐지?
//
//        // 가장 많이 겹치는 곳 위주로?
//
//        // => 겹치는 곳 count하기
//
//        // 1. count변수를 만들자. 이 변수의 최댓값은 target에서 가장 큰 좌표*2
//        // 요격은 실수 가능 -> 정수 + 0.5를 포함할 것이므로 2배로 만들었다.
//        // 그리고 target도 0.5 단위로 볼 것이므로 같이 두 배로 만든다.  // 길이 조절이 자유롭게 arraylist로 만든다.
//        int max = 0;
//        int[][] newTarget = new int[targets.length][targets[0].length];
//
//
//        for (int i = 0; i < targets.length; i++){
//            for (int j = 0; j < targets[i].length; j++){
//                if (max < targets[i][j]){
//                    max = targets[i][j];
//                }
//                newTarget[i][j] = targets[i][j] * 2;
//            }
//        }
//
//        int[] count = new int[max*2];
//
//
//        // count해본다.
//
//        for (int i = 0; i < newTarget.length; i++) {
//            for (int j = newTarget[i][0] + 1; j < newTarget[i][1]; j++) {
//                count[j]++;
//            }
//        }
//
////        count까지는 ok
////        for (int i = 0; i<count.length;i++){
////            System.out.println(count[i]);
////        }
//
////        int[][] finalTarget = new int[targets.length][targets[0].length];
////        for (int i = 0; i < finalTarget.length; i++) {
////            finalTarget[i][0] = -1;
////            finalTarget[i][1] = -1;
////        }
//
//        int maxOverlapped;
//        int coodinate;
//
//        while (hasTargets(newTarget)) {
//
//            maxOverlapped = 0;
//            coodinate = 0;
//
//            for (int i = 0; i < count.length; i++) {
//                if (maxOverlapped < count[i]) {
//                    maxOverlapped = count[i];
//                    coodinate = i;
////                    System.out.println(maxOverlapped);
//                }
//            }
//
//
//            for (int j = 0; j < newTarget.length; j++) {
//                if (newTarget[j][0] <= coodinate && newTarget[j][1] >= coodinate) {
//                    newTarget[j][0] = 0;
//                    newTarget[j][1] = 0;
//                    }
//                }
//
//            for (int i = 0; i<count.length;i++){
//                count[i] = 0;
//            }
//
//            // 새로 카운트 하기
//            for (int i = 0; i < newTarget.length; i++) {
//                for (int k = newTarget[i][0] + 1; k < newTarget[i][1]; k++) {
//                    count[k]++;
//                }
//            }
//            answer++;
//    }

        return answer;
    }

//    private static boolean hasTargets(int[][] targets) {
//        for (int i = 0; i < targets.length; i++) {
//            if (targets[i][0] != 0) {
//                return true;
//            }
//        }
//        return false;
//    }
}
