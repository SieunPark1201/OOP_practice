package NotePractice.Sec5Prac;

public class ATest6 {
    public static void main(String[] args) {
        int x = 1;
        tryToChange(x);
        System.out.println(x);
    }
    static void tryToChange(int x) {
        x = 3;
    }
}
//이 코드의 결과가 왜 3이 아니라 1이야? 자세히 설명해줘...
//
//tryToChange 메서드가 호출되고, x 변수의 값 (1)이 해당 메서드로 복사됩니다. 이 복사본은 tryToChange 메서드의 로컬 변수로 사용됩니다.
//tryToChange 메서드에서 로컬 변수 x의 값을 3으로 변경합니다. 그러나 이 변경은 main 메서드에서 선언한 x 변수에는 영향을 미치지 않습니다.
//tryToChange 메서드가 종료되면 로컬 변수 x는 소멸됩니다. 이로 인해 main 메서드에서 선언한 x 변수에는 아무런 변화가 없으며 여전히 1의 값을 가지고 있습니다.
