package Programmers.lv2;

public class maxAndMin {
    public String solution(String s) {
        String answer = "";

        // 띄어쓰기를 기준으로 문자열을 나누고, 그 문자열 array를 int로 변환하기
        String[] splitted = s.split(" ");
        int[] numbers = new int[splitted.length];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(splitted[i]);
        }

        // 최대, 최소 찾기

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
            if (max < numbers[i]){
                max = numbers[i];
            }
        }

        // 최소, 최대 순의 문자열 만들기
        answer = min+" "+max;

        return answer;
    }
}
