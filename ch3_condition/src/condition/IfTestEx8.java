package condition;

import java.util.Scanner;

public class IfTestEx8 {
    public static void main(String[] args) {
        // 임금 구하기

        // 시간당 임금
        int rate = 9800;
        int pay, hours;

        // 사용자로부터 근무시간을 입력받아 hours 변수에 담기
        Scanner scanner = new Scanner(System.in);
        System.out.println("근무시간 : ");
        String input = scanner.nextLine();
        hours = Integer.parseInt(input);

        // 근무시간이 8시간 까지는 시간당 임금을 지불
        // 8시간 초과 근무시에는 시간당 임금의 1.5배 지불함
        // 임금 계산 후 pay 변수에 담기

        // 10시간 : 8 * 9800 + 2 * 9800 *1.5
        if (hours > 8) {
            pay = rate * 8 + (int)(rate * (hours - 8) * 1.5);
        } else {
            pay = rate * hours;
        }

       

        // 최종 출력
        // 받는 임금은 (금액)
        System.out.println("받는 임금은 " + pay);

    }
}
