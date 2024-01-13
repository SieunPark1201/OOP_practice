package Programmers.lv0;

public class babbling {

    public static int solution(String[] babbling) {

        int answer = 0;



        for (int i = 0; i < babbling.length; i++){
            if (!babbling[i].equals("")) {
                babbling[i] = babbling[i].replaceAll("aya", " ");
                babbling[i] = babbling[i].replaceAll("ye", " ");
                babbling[i] = babbling[i].replaceAll("woo", " ");
                babbling[i] = babbling[i].replaceAll("ma", " ");
                babbling[i] = babbling[i].replaceAll(" ","");
                if (babbling[i].equals("")) {
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        String[] babbling1 = new String[5];
        babbling1[0] = "ayaye";
        babbling1[1] = "uuuma";
        babbling1[2] = "ye";
        babbling1[3] = "yemawoo";
        babbling1[4] = "ayaa";
        System.out.println(solution(babbling1));
    }


}
