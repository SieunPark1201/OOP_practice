package NotePractice;

public class Sec1Prac {

////// 2. Expressions

//    identifier(식별자): 이름을 의미

//    primitive type
//    reference type

//    literal(변수)

//    long 리터럴에는 반드시 수 끝에 L을 붙여줘야함


////// 3. String

//    class:
//    object: = class instance

//    method: 오브젝트가 취하는 액션
//          싱글타입의 값을 리턴하거나 계산 등을 할 수 잇음

//    method를 call한다: 해당 오브젝트에 어떤 액션을 취하라고 메세지를 보낸다

//    argument


//    자바의 String 오브젝트는 immutable. 한 번 assign되고 나면 그 값을 바꿀 수 없다.
//    캐릭터를 하나하나씩 접근해서 바꿀 수는 없다.
//    새로운 assignment statement를 사용하면 바꿀 수 있움

//    constance: 상수

//    documentation: 각주

    public static final double pi = 3.14;
    public static void main(String[] args) {
//
//        String str1 = "Hello";
//        String str2 = "Java";
//        String str3 = str1 + str2;
//        String str5 = "The answer is: " + 42;
//        int k = 35;
//        String str6 = "Yes "+ k;
//
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str5);
//        System.out.println(str6);


////        .length()  -> int
        String greeting = "Hello";
//            int count = greeting.length();
//        System.out.println(count);
//
////        .equals(다른 String변수) -> boolean
//        String greeting2 = "hello";
//        String greeting3 = "Hello";
//        String greeting5 = "ohell";
//
//        boolean same = greeting.equals(greeting2);
//        boolean same1 = greeting.equals(greeting3);
//        boolean same2 = greeting.equals(greeting5);
//
//        System.out.println(same);
//        System.out.println(same1);
//        System.out.println(same2);


//      .equalsIgnoreCase(다른 String) -> boolean

//        boolean same3 = greeting.equalsIgnoreCase(greeting2);
//        System.out.println(same3);

//      .toLowerCase()
//      .toUpperCase()


//        .trim(): 스페이스, 탭, \n 제거
        String str6 = "      히히 공간낭비      ";
        String str6tr = str6.trim();
        System.out.println(str6tr);


//        .charAt(위치번호) -> char
        char greeting_1 = greeting.charAt(0);
        char greeting_2 = greeting.charAt(3);
//        char greeting_3 = greeting.charAt(5);  // 이건 outOfBounds오류남

        System.out.println(greeting_1);
        System.out.println(greeting_2);
//        System.out.println(greeting_3);


//        .substring(시작번호)
//        .substring(시작번호, 끝번호)

        System.out.println(greeting.substring(3));


//        .indexOf(String값)
        String str8 ="Strong minsu";
        String str0 ="minsu";
        String str12 ="Minsu";
        int minsu = str8.indexOf(str0);
        System.out.println(minsu);
        System.out.println(str8.indexOf(str12));


//        .indexOf(String값, 시작위치번호)
        String ind = "Hello Hello Minsu Hello";
        int ind2 = ind.indexOf("Hello",2);
        System.out.println(ind2);

//        .lastIndexOf(String값)


//        .compareTo(String값)     ***** 중요 *****
//        .compareToIgnoreCase(String값)



//        이스케이프 문자
//        \"
//        \'
//        \\
//        \t
//        \n
//        \r -> 해당 줄의 첫 줄로 감

        System.out.println("Hey Guys\n \\\"Oh\"\\\tgood!\nre?\rre!");




    }
}
