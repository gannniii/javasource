package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();

        // 6개 숫자 무작위 추출
        for (int i = 0; lotto2.size() < 6; i++) {
            // 로또번호 1 ~ 45
            int num = (int) (Math.random() * 45) + 1;
            // lotto1.add(num);
            lotto2.add(num);

        }
        // hashset : [33, 4, 21, 22, 27, 11]
        System.out.println(lotto2); // [5, 9, 16, 35, 41, 43]
    }
}
