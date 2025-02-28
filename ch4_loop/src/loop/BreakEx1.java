package loop;

public class BreakEx1 {
    public static void main(String[] args) {
        // break : switch, 반복문 중지(break 포함된 가장 가까운 )

        int sum = 0, i = 0;

        while (true) {
            // if : 실행할 구문이 하나인 걍으 {} 생략
            // sum 값이 100보다 큰 경우 break
            if (sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.printf("i = %d, sum = %d", i, sum);
    }
}
