package ProgrammersLevelZero;

import java.util.Arrays;

public class MaxMakeTwo {
    public static void main(String[] args) {
        // 최댓값 만들기 (2)
        int[] numbers = {10, 20, 30, 5, 5, 20, 5};
        Arrays.sort(numbers);
        int max_a = numbers[numbers.length-1] * numbers[numbers.length-2];
        int max_b = numbers[0] * numbers[1];
        if (max_a > max_b) {
            System.out.println(max_a);
        } else {
            System.out.println(max_b);
        }
    }
}
