package array;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
            System.out.println(Arrays.toString(ball));
        }

        for (int i = 0; i < 6; i++) {
            // 0~44 무작위 수 추출
            int pos = (int) (Math.random() * 45);
            // 교환
            int temp = ball[i];
            ball[i] = ball[pos];
            ball[pos] = temp;
        }

        System.out.println(Arrays.toString(ball));

    }
}
