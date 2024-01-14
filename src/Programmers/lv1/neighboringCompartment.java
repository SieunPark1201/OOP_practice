package Programmers.lv1;

public class neighboringCompartment {


    public int solution(String[][] board, int h, int w) {
        int answer = 0;

//        1. 정수를 저장할 변수 n을 만들고 board의 길이를 저장합니다.
        int n = board.length;

//        2. 같은 색으로 색칠된 칸의 개수를 저장할 변수 count를 만들고 0을 저장합니다.
        int count = 0;

//        3. h와 w의 변화량을 저장할 정수 리스트 dh, dw를 만들고 각각 [0, 1, -1, 0], [1, 0, 0, -1]을 저장합니다.
        int[] dh = new int[4];
        dh[0] = 0;
        dh[1] = 1;
        dh[2] = -1;
        dh[3] = 0;

        int[] dw = new int[4];
        dw[0] = 1;
        dw[1] = 0;
        dw[2] = 0;
        dw[3] = -1;

//        4. 반복문을 이용해 i 값을 0부터 3까지 1 씩 증가시키며 아래 작업을 반복합니다.
//        4-1. 체크할 칸의 h, w 좌표를 나타내는 변수 h_check, w_check를 만들고 각각 h + dh[i], w + dw[i]를 저장합니다.
//        4-2. h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만이라면 다음을 수행합니다.
//        4-2-a. board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가시킵니다.
        for (int i = 0; i < 4; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];   //변수를 최대한 좁은 범위에서 선언하면 코드를 이해하고 유지보수하기 쉬워지니 for문 안에 선언하기

            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h][w].equals(board[h_check][w_check])) {  //같은 색인지 확인
                    count++;
                }
            }
        }

//        5. count의 값을 return합니다.
        answer = count;

        return answer;
    }

}
