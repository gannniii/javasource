package array;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" },
        };

        Scanner sc = new Scanner(System.in);

        // Q1. chair의 뜻은? 의자
        // 정답임
        // Q2. computer의 뜻은? 의자
        // 틀림 정답은 컴퓨터임

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s 의 뜻은?", i + i, words[i][0]);

            // 사용자 입력
            String input = sc.nextLine();

            if (input.equals(words[i][1])) {
                System.out.println("정답");
            } else {
                System.out.printf("틀림 정답은 %s 임\n", words[i][1]);
            }
        }
    }
}
