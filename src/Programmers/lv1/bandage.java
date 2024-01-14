package Programmers.lv1;

public class bandage {


    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int heart = health; //남은 체력
        int j = 0;
        int bandaging = 0; // 붕대 감기 유지 시간

        //몬스터의 마지막 공격 시간까지 알고리즘을 진행시킴.
        //i=초
        for (int i = 1; i <= attacks[attacks.length-1][0]; i++) {


                if(i==attacks[j][0]){
                    heart -= attacks[j][1];
                        j++;
                    bandaging = 0;

                } else {
                    bandaging++;
                    heart += bandage[1];

                    if (bandaging == bandage[0]) {
                        heart += bandage[2];
                        bandaging = 0;
                    }

                    if (heart > health) {
                        heart = health;
                    }
                }

                if (heart <= 0){  //체력이 0이 되면 게임 종료
                    break;
                }
        }

        if (heart <= 0) {
            answer = -1;
        } else {
            answer = heart;
        }
        return answer;
    }

}
