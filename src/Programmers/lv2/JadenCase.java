package Programmers.lv2;

public class JadenCase {

    public static void main(String args[]){

        String s1 = "3people unFollowed me";
        String s2 = "for the last week";

        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }


    public static String solution(String s) {
        String answer = "";

        String[] answer1 = s.split(" ");

        for (int i = 0; i < answer1.length; i++){
            // 아스키 코드가 소문자를 나타내는 수라면 대문자로 변환
            if ((int) answer1[i].charAt(0) >= 97 && (int) answer1[i].charAt(0) <= 122){
                String[] temp =answer1[i].split("");
                temp[0].toUpperCase();
                for (int j = 0; j < temp.length; j++){
                    answer1[i] += temp[j];
                }
            }
        }

        for (int i = 0; i < answer1.length; i++){
            answer += answer1[i];
            if (i != answer1.length-1){
                answer += " ";
            }
        }

        return answer;
    }



}
