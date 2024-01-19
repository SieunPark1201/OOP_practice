package Programmers.lv2;

import java.util.Arrays;

public class homework_unsolved {

    public static void main(String[] args) {



        String[][] plans = {
                {"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}
        };

        String[] solve = solution(plans);
        for (int i = 0; i < solve.length ; i++){
            System.out.println(solve[i]);
        }


    }


    public static String[] solution(String[][] plans) {

        String[] answer = new String[plans.length];


        // 계산을 위해 시각을 시간으로 변환하기. (원본 값은 변하지 않게 새 배열 생성)
        int[] time = new int[plans.length];

        for (int i = 0; i < plans.length; i++){

            time[i] = Integer.parseInt(plans[i][1].split(":")[0]) * 60
                    + Integer.parseInt(plans[i][1].split(":")[1]);
        }


        String[][] sortedPlans = Arrays.copyOf(plans, plans.length);


        // 먼저 시간 순으로 정렬해주기.
        for (int i = 0; i < time.length; i++){
            for (int j = i; j < time.length; j++) {
                if ( time[i] > time[j] ){
                    int temp = time[i];
                    time[i] = time[j];
                    time[j] = temp;

                    sortedPlans[i] = plans[j].clone();
                    sortedPlans[j] = plans[i].clone();
                }
            }
        }

        // 잘 정렬되었는지 확인

//        for (int i = 0; i < sortedPlans.length; i++) {
//            for (int j = 0; j < sortedPlans[0].length; j++){
//
//                System.out.println(sortedPlans[i][j]);
//            }
//        }


        // 계산을 위해 시각을 시간-처음시간 = 소요시간 으로 변환하기. (원본 값은 변하지 않게 새 배열 생성)


        int initialTime = Integer.parseInt(sortedPlans[0][1].split(":")[0]) * 60
                                + Integer.parseInt(sortedPlans[0][1].split(":")[1]);

        for (int i = 0; i < sortedPlans.length-1; i++){

            time[i] = Integer.parseInt(sortedPlans[i+1][1].split(":")[0]) * 60
                                + Integer.parseInt(sortedPlans[i+1][1].split(":")[1])
                                - initialTime;
        }
        time[sortedPlans.length-1] = 100 * sortedPlans.length;



////        잘 진행되었는지 확인
//
//        for (int i = 0; i < plans.length; i++){
//            System.out.println(time[i]);
//        }



        // for문 돌려서 과제 시작시키기
            // Integer.parseInt(sortedPlans[i][2]) < time[i] 이라면
                  // answer[num] = sortedPlans[i][0];
                  // num++;
                  // time[i] -= Integer.parseInt(sortedPlans[i][2])     // time 은 남은 시간. -면 그만큼 더 필요하다는 뜻

                    // 첫번쨰라면 break;
                    // 두번쨰 이상이라면
                        // 앞의 과제를 모두 완료했다면 break;
                        // 완료하지 않은 과제가 있다면; time을 i까지 for문 돌려서 time[j] < 0 이라면
                        // 남은 시간동안 해당 과제 풀기; while (time[i] != 0)
                                // if time[i] < -time[j]
                                // time[j] += time[i]
                                // time[i] = 0

                                // if ==
                                // time[i] = 0
                                // answer[num] = sortedPlans[j][0];
                                // num++;

                                // if >
                                // time[i] += time[j];
                                // time[j] = 0
                                // answer[num] = sortedPlans[j][0];
                                // num++;


            // Integer.parseInt(plans[i][2]) = time[i] 이라면
                    // time[i] = 0
                    // answer[num] = sortedPlans[i][0];
                    // num++;

            // Integer.parseInt(sortedPlans[i][2]) > time[i] 이라면
                    // time -= Integer.parseInt(sortedPlans[i][2])    // 마이너스 나옴




        int num = 0;


            for (int i = 0; i < sortedPlans.length - 1; i++) {

                if (Integer.parseInt(sortedPlans[i][2]) < time[i]) {
                    answer[num] = sortedPlans[i][0];
                    num++;
                    time[i] -= Integer.parseInt(sortedPlans[i][2]);

                    while (time[i] != 0) {
                        boolean progress = false;  // 과제를 진행했는지 여부를 나타내는 플래그

                        for (int j = 0; j < i; j++) {
                            if (time[j] < 0) {
                                if (time[i] < -time[j]) {
                                    time[j] += time[i];
                                    time[i] = 0;
                                } else if (time[i] == -time[j]) {
                                    time[i] = 0;
                                    time[j] = 0;
                                    answer[num] = sortedPlans[j][0];
                                    num++;
                                    progress = true;
                                    break;  // 과제를 진행했으므로 for 루프 종료
                                } else if (time[i] > -time[j]) {
                                    time[i] += time[j];
                                    time[j] = 0;
                                    answer[num] = sortedPlans[j][0];
                                    num++;
                                    progress = true;
                                    break;  // 과제를 진행했으므로 for 루프 종료
                                }
                            }
                        }

                        if (!progress) {
                            break;  // 더 이상 진행할 과제가 없으면 while 루프 종료
                        }
                    }

                } else if (Integer.parseInt(sortedPlans[i][2]) == time[i]) {
                    time[i] = 0;
                    answer[num] = sortedPlans[i][0];
                    num++;
                } else if (Integer.parseInt(sortedPlans[i][2]) > time[i]) {
                    time[i] -= Integer.parseInt(sortedPlans[i][2]);
                }
            }



        // 마지막 시간
        for (int i = 0 ; i < sortedPlans.length; i++) {
            if (time[i] < 0){
                if (num > sortedPlans.length){
                    break;
                }
                answer[num] = sortedPlans[i][0];
                num++;
            }
        }

        if ( answer[sortedPlans.length-1] == null ){
            answer[sortedPlans.length-1] = sortedPlans[sortedPlans.length-1][0];
        }

        return answer;
    }


}
