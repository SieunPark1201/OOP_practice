package Programmers.lv1;

public class dataAnalysis {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        int conditionNum;
        switch (ext) {
            case "code":
                conditionNum = 0;
                break;
            case "date":
                conditionNum = 1;
                break;
            case "maximum":
                conditionNum = 2;
                break;
            case "remain":
                conditionNum = 3;
                break;
            default:
                conditionNum = 0;
                break;
        }

        //처음에는 반복문을 switch문에다 넣어봤는데, 불필요한 반복이 있어 sortingNum이라는 변수를 추가하고 반복문을 아래에 뺐다.

        // answer 길이 정해주기
        int answerNum = 0;
        for (int i = 0; i < data.length; i++){
            if (data[i][conditionNum] < val_ext) {
                answerNum++;
            }
        }
        answer = new int[answerNum][4];


        //조건 따라 거르기
        int n = 0;
        for (int i = 0; i < data.length; i++){
            if (data[i][conditionNum] < val_ext) {
                answer[n] = data[i];
                n++;
            }
        }


        int sortingNum;

        switch (sort_by){
            case "code":
                sortingNum = 0;
                break;
            case "date":
                sortingNum = 1;
                break;
            case "maximum":
                sortingNum = 2;
                break;
            case "remain":
                sortingNum = 3;
                break;
            default:
                sortingNum = 0;
                break;
        }

        // 정렬
        for (int i = 0; i < answer.length; i++){
            for (int j = i+1; j < answer.length; j++){
                if (answer[i][sortingNum] > answer[j][sortingNum]) {
                    int[] temp;
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }


        return answer;
    }


}
