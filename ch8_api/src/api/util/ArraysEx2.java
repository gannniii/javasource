package api.util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        Integer[] arr = { 33, 24, 15, 66, 7 };

        // 배열 안에 15가 들어있는가?
        Arrays.sort(arr); // [7, 15, 24, 33, 66]
        System.out.println("15 위치 " + Arrays.binarySearch(arr, 15));

        // 배열 비교
        Integer[] arr1 = { 33, 24, 15, 66, 7 };
        Integer[] arr2 = { 33, 24, 15, 66, 8 };
        System.out.println("배열 요소 비교 " + Arrays.equals(arr1, arr2));

    }
}
