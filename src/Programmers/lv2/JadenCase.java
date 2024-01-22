package Programmers.lv2;

public class JadenCase {

    public static void main(String args[]){

        String s1 = "3people   unFollowedunFollowed mE mEow   ";
        String s2 = "for the last week";

        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }


    public static String solution(String s) {
        String answer = "";



        String[] answer1 = s.split("\\s+");   // 여러 개의 공백을 하나의 공백으로 처리

        String answer2 = s;

        String[] newAnswer = s.split("\\s+");  // 여러 개의 공백을 하나의 공백으로 처리


        for (int i = 0; i < answer1.length; i++){
            String[] temp =answer1[i].split("");

            // 아스키 코드가 소문자를 나타내는 수라면 대문자로 변환
            if (((int) answer1[i].charAt(0)) >= 97 && ((int) answer1[i].charAt(0)) <= 122){
                temp[0] = temp[0].toUpperCase();
            }

            // 첫 문자를 제외한 나머지 문자들이 대문자라면 소문자로 변환
            for (int j = 1; j < temp.length; j++){
                if (((int) temp[j].charAt(0)) >= 65 && ((int) temp[j].charAt(0)) <= 90){
                    temp[j] = temp[j].toLowerCase();
                }
            }

            // newAnswer[i] 초기화
            newAnswer[i] = "";

            //newAnswer[i]에 temp 할당
            for (int j = 0; j < temp.length; j++){
                newAnswer[i] += temp[j];
            }

        }

        for (int i = 0; i < answer1.length; i++){

            //\b는 단어의 경계를 나타내며, 이렇게 사용하면 정확한 단어에 대해서만 대체가 이루어짐.
            answer2 = answer2.replaceFirst("\\b" + answer1[i] + "\\b", newAnswer[i]);
        }

        answer = answer2;

        return answer;
    }



}
