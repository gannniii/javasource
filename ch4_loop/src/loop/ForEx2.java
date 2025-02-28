package loop;

// 반복문 - for, while, do-while
// 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx2 {
    public static void main(String[] args) {

        // 반복문 중단 : 강제 중단(break) or 조건이 false
        // 1번 - int i = 0; 초기화(한번만 실행)
        // 2번 - 조건검사 i < 5;
        // 3번 - 루프 안으로 진입 (hi 출력)
        // 4번 - 증감연산자 i++ 실행(i = 1)
        // 5번 - 조건검사
        // 6번 - 루프 안으로 진입 (hi 출력)
        // 7번 - 증감연산자 i++ 실행(i = 2)
        // 8번 - 5번~7번 반복
        // 9번 - 증감연산자 i++ 실행 (i = 5)
        // 10번 - 조건검사 5 < 5 루프 중단

        for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        // 10~1
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   ");
        }
        System.out.println();

        // 짝수만 출력 1~10
        for (int i = 1; i < 11; i++) {
            // i가 짝수이면 출력
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }

        }
        System.out.println();

        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + "   ");
        }

        int i = 0;
        for (int j = 0, k = 1; i < args.length; i++) {

        }

        // for (; ;){

        // }

    }
}
