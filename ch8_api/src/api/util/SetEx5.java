package api.util;

import java.util.TreeSet;

public class SetEx5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        String from = "b", to = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("flower");
        set.add("fan");
        System.out.println(set);
        // to는 포함 안함
        // 범위 검색
        System.out.println(set.subSet(from, to));
        System.out.println(set.subSet(from, to + "zzzz"));

    }
}
