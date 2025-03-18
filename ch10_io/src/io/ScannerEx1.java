package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStram
        // 2) Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num1 = sc.nextInt();
        System.out.println("연산자 입력 (+, -, *, /)");
        // String op = sc.nextLine();
        String op = sc.next();
        System.out.println("숫자 입력");
        int num2 = sc.nextInt();

    }
}
