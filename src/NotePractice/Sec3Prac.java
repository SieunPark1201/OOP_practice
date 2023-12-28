package NotePractice;
import java.util.Random;   // 잘 안 씀

public class Sec3Prac {
    public static void main(String[] args){
//        5. Random Numbers


//        random 객체 (잘 안 씀)
        Random ran = new Random();
        int r = ran.nextInt();
        r = ran.nextInt(10) ;   // 0부터 구까지
        r = ran.nextInt(11)+ 10;  // 10부터 20까지
        double rd = ran.nextDouble();   // 더블은 0.0 부터 1.0미만 랜덤으로


//        Math.random() 메서드  // 별개의 임포트 필요없음
        System.out.println(Math.random());    // 0.0이상 1.0 미만






////        1.Branching
//        if ( ) {
//
//        } else {
//
//        }
//
//        switch {
//            case (case1):
//                ...
//                break;
//            case ...:
//                break;
//
//            default:
//                break;
//        }
//
//        int s = (조건문) ? 조건문이 참인경우 : 조건문이 거짓인 경우


////        3. Loops
//
//        while (조건문) {
//            조건문이 참인 경우동안 실행되는 코드
//        }
//
//        do {
//
//
//        } while ();
//
//
//        for ( 선언; 조건문; update) {
//
//        }

//        5. Random Numbers




    }
}
