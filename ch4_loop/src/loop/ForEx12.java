package loop;

public class ForEx12 {
    public static void main(String[] args) {
        // 4x + 5y = 60
        // x, y는 10 이하의 자연수
        // 출력문 예시 (5, 3)

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }
}
