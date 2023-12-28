package ExamPractice.Mid2022_1;
import java.sql.Struct;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Mid02: Simple Calculator

DESCRIPTION:

	간단한 계산기를 구현한다. 계산에 사용되는 모든 수는 정수이다.
	input으로 주어진 operand들을 현재 result에 더하거나 (add), 빼거나 (sub), 곱할 수 (mult) 있다.
	operand들의 수는 0개부터 3개까지 가능하며, 그 이상의 입력은 없다고 가정한다.
	예를 들면 result = 2인 상태에서 add 1 3  이 input 되면 result = 2 + 1 + 3 = 6  이 된다.
	프로그램을 시작할 때 result = 0 을 보여준다.
	명령어를 입력받기 전에 항상 현재의 result를 보여준다.
	프로그램을 끝내는 명령은 "exit" 이며,  "bye" 가 print되고 프로그램이 끝난다.
	잘못된 명령어가 입력되면 "wrong operation: {입력명령어}" 를 프린트 하며, 그 뒤에 입력된 operand들은 무시된다.
	모든 operand들은 유효한 정수라 가정한다. (예를 들면 add a seoul  이런 입력은 없다)

HINTS:
1) switch와 do-while 문을 사용하면 편하다. (필수사항 아님)

INPUT:

한 줄로 아래와 같은 형식의 명령이 입력된다.

operator [operand1] [operand2] [operand3]

SAMPLE:
result=0
add 3 5 -1          // input
result=7
sub -2 +5 7        // input
result=-3
mult 2 -1 5         // input
result=30
add 1 2                // input
result=33
add                      // input
result=33
sub 5                   // input
result=28
mult -2                // input
result=-56
adb 2 -1              // input
wrong operation: adb
result=-56
sub -5                  // input
result=-51
mult 2 2 5            // input
result=-1020
exit                       // input
bye
*/
public class Mid2022_1_02 {
    public static void main(String[] args) {

        Boolean end = true;
        int num = 0;
        System.out.println("result="+num);

        do {
            Scanner scanner = new Scanner(System.in);
            String operand = scanner.next();

            switch (operand) {
                case "add":
                    String line = scanner.nextLine();
                    StringTokenizer stk = new StringTokenizer(line);

                    while (stk.hasMoreTokens()) {
                        String token = stk.nextToken();
                        num += Integer.parseInt(token);
                    }
                    System.out.println("result="+num);
                    break;
                case "sub":
                    line = scanner.nextLine();
                    stk = new StringTokenizer(line);

                    while (stk.hasMoreTokens()) {
                        String token = stk.nextToken();
                        num -= Integer.parseInt(token);
                    }
                    System.out.println("result="+num);
                    break;
                case "mult":
                    line = scanner.nextLine();
                    stk = new StringTokenizer(line);

                    while (stk.hasMoreTokens()) {
                        String token = stk.nextToken();
                        num *= Integer.parseInt(token);
                    }
                    System.out.println("result="+num);
                    break;

                case "exit":
                    System.out.println("bye");
                    end = false;

                default:
                    System.out.println("wrong operation:"+operand);
                    System.out.println("result="+num);
                    line = scanner.nextLine();

            }

        } while (end);

    }
}
