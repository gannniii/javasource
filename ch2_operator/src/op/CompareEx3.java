package op;

// 비교연산자
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// 문자열 : "a", "abc"

public class CompareEx3 {
    public static void main(String[] args) {
        // 변수 선언 : 기본 타입
        // 문자열은 기본타입으로 선언 안함. 객체타입으로 선언
        String str1 = "abc"; 
        String str2 = "abc";
        String str3 = new String("abc");

        //str1(str2)을 저장하는 공간과 str3을 저장하는 공간이 다름
        // 같은 공간에서 저장된 문자열 비교시 ==을 사용(값 비교)하면 true
        // 다른 공간에서 저장된 문자열 비교시 ==을 사용(주소 비교)

        System.out.printf("str1 == str2 = %b\n", (str1 == str2));
        System.out.printf("str1 == str3 = %b\n", (str1 == str3));
        //문자열 비교 == 대신에, equals(), equalsIgnoreCase() 사용(대소문자 구별 안함)
        System.out.printf("str1.equals(str3) = %b\n", (str1.equals(str3)));
        System.out.printf("str1.equals(ABC) = %b\n", (str1.equals("ABC")));
        System.out.printf("str1.equalsIgnoreCase(str3) = %b\n", (str1.equalsIgnoreCase(str3)));
        System.out.printf("str1.equalsIgnoreCase(ABC) = %b\n", (str1.equalsIgnoreCase("ABC")));

    }
}
