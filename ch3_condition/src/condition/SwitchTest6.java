package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력받은 후 계산해서 결과 출력
        // + - * / %

        Scanner scanner = new Scanner(System.in);
        System.out.println("피연산자 1 : ");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("피연산자 2 : ");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.println("연산자 : ");
        String oper = scanner.nextLine();
        
        int result = 0;
        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;

            default:
            System.out.println("입력값을 확인해주세요");
            System.exit(0); //프로그램 종료
           
        }

        if (result != 0) {
            System.out.printf("%d %s %d = %d", num1, oper, num2, result);
        }

      
    }
}
