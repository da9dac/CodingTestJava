package ProgrammersLevelZero;

import java.util.Arrays;

public class ArrayTwice {
    public static void main(String[] args) {
        // 배열 두 배 만들기
        int[] numbers = {1,2,100,-99,1,2,3};
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }

        System.out.println(Arrays.toString(result));
    }
}
