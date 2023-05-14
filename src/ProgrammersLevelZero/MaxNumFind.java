package ProgrammersLevelZero;

import java.util.Arrays;

public class MaxNumFind {
    public static void main(String[] args) {
        // 가장 큰 수 찾기
        int[] array = {9, 10, 11, 8};
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
