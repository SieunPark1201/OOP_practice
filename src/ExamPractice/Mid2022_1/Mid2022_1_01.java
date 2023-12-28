package ExamPractice.Mid2022_1;
/*

Mid01: Words

주어진 문장 안의 word들을 대소문자 구분 없이 사전식 순서로 출력하는 프로그램을 작성하라.

[CONDITIONS]

1) // your code here부분에만 코드를 작성할 수 있다.

HINTS:
1) StringTokenizer 를 사용하는 것이 좋다. (필수사항 아님)
2) String의 compareToIgnoreCase method를 사용하는 것이 좋다. (필수사항 아님)
3) 사전식 배열: 특수기호 < 숫자 < .. < 영문 알파벳 대문자 < .. < 영문 알파벳 소문자 임

INPUT: no input

OUTPUT:
a city in is Korea largest Seoul
?boy All come dreams my true will
Hi

123th Busan. in is That visit your

[CODE TEMPLATE]

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		String str1 = "Seoul is a largest city in Korea";
		String str2 = "All my dreams will come true ?boy";
		String str3 = "Hi";
		String str4 = "";
		String str5 = "That is your 123th visit in Busan.";

		String[] strs = {str1, str2, str3, str4, str5};

		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];

          	// your code here

			System.out.println();
		}
	}
}

 */

import java.util.StringTokenizer;

public class Mid2022_1_01 {


    public static void main(String[] args) {

        String str1 = "Seoul is a largest city in Korea";
        String str2 = "All my dreams will come true ?boy";
        String str3 = "Hi";
        String str4 = "";
        String str5 = "That is your 123th visit in Busan.";

        String[] strs = {str1, str2, str3, str4, str5};

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            // your code here

            StringTokenizer stringTokenizer = new StringTokenizer(str);
            int count= stringTokenizer.countTokens();
            String[] strstr = new String[count];

            for (int j = 0; j < count; j++) {
                strstr[j] = stringTokenizer.nextToken();
            }

            for (int k = 0; k < count; k++) {
                for (int l = 0; l < k - 1; l++) {
                    if (strstr[l].compareToIgnoreCase(strstr[l + 1]) > 0) {
                        String temp = strstr[l];
                        strstr[l] = strstr[l + 1];
                        strstr[l + 1] = temp;
                    }
                }
            }

            for (int k = 0; k < count; k++) {
                System.out.print(strstr[k]);
                if (k < count-1){
                    System.out.print(" ");
                }
            }


            System.out.println();
        }


    }

}
