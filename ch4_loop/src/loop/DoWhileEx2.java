package loop;

import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {

        // 문자 입력받은 후 출력
        // q 입력시 반복문 종료

        Scanner scanner = new Scanner(System.in);
        System.out.println("메세지 입력");

        String input;

        do {
            System.out.println("종료를 원하면 q, Q 입력");
            System.out.println(">>");
            input = scanner.nextLine();

        } while (!input.equalsIgnoreCase("q")); // ==, != -> equals

        System.out.println("정답. 프로그램 종료");
    }
}
