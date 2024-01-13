package Programmers.lv1;

public class maxPresent {


        public int solution(String[] friends, String[] gifts) {
            int answer = 0;

            // 선물 지수 변수 만들기
            // 어떤 type으로 만드는 게 좋을까? -> 배열로 만들어보자. friends 배열의 인덱스에 맞게 수를 배치
            // 계산의 용이함을 위해 준 선물과 받은 선물 배열을 따로 만든 후, 이를 계산하여 선물 지수 만들기
            int[] give = new int[friends.length];
            int[] take = new int[friends.length];
            int[] giftIndex = new int[friends.length];


            // 각 친구의 선물 지수 계산하기
            for (int i = 0; i < gifts.length; i++){
                String[] giveAndTake1 = gifts[i].split(" ");
                for (int j = 0; j < friends.length; j++){
                    if (giveAndTake1[0].equals(friends[j])){
                        give[j]++;
                    } else if (giveAndTake1[1].equals(friends[j])) {
                        take[j]++;
                    }
                }
            }

            for (int i = 0; i < giftIndex.length; i++){
                giftIndex[i] = give[i] - take[i];
            }

            // 서로 주고받은 선물 갯수 확인하기
            // 이차원 배열로 만들기
            int[][] giveAndTakeNum = new int[friends.length][friends.length];

            for (int i = 0; i < friends.length; i++) {
                for (int j = 0 ; j < friends.length; j++) {
                    for (int k = 0; k < gifts.length; k++) {

                        String[] giveAndTake2 = gifts[k].split(" ");

                        if (i != j) {   // 자기 자신에게 준/받은 선물은 체크할 필요가 없음
                            if (giveAndTake2[0].equals(friends[i])) {

                                if (giveAndTake2[1].equals(friends[j])) {
                                    giveAndTakeNum[i][j]++;

                                }
                            }
                        }
                    }
                }
            }

            // 서로 주고받은 선물 갯수 비교하기
                // 각자 받을 선물 계산한 후 값을 받을 변수 설정하기

            int[] answers = new int[friends.length];

            for (int i = 0; i < giveAndTakeNum.length; i++){
                for (int j = 0; j < giveAndTakeNum[i].length; j++){
                    if (i!=j) {
                        if (giveAndTakeNum[i][j] == giveAndTakeNum[j][i]) {
                            if (giftIndex[i] > giftIndex[j]) {
                                answers[i]++;
                            } else if (giftIndex[i] < giftIndex[j]) {
                                answers[j]++;
                            }

                        } else if (giveAndTakeNum[i][j] > giveAndTakeNum[j][i]) {
                            answers[i]++;
                        } else if (giveAndTakeNum[i][j] < giveAndTakeNum[j][i]) {
                            answers[j]++;
                        }
                    }
                }
            }
            // 가장 많이 받는 선물의 수

            answer = answers[0];
            for (int i = 1; i < answers.length; i++) {
                if (answer < answers[i]) {
                    answer = answers[i];
                }
            }

            // 위의 반복문에서 두 번씩 계산되었으므로 2를 나누어줘야 한다.
            answer = answer / 2;
            return answer;
        }



}
