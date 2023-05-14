package ProgrammersLevelZero;

import java.util.Arrays;

public class BallThrow {
    public static void main(String[] args) {
        // 공 던지기
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;
        int[] number = new int[k * 2 - 1];
        int count = 0;

        while (count < number.length - 1) {
            for (int i = 0; i < numbers.length; i++) {
                if (count == number.length) {
                    break;
                }
                number[count] = numbers[i];
                count++;
            }
        }

        System.out.println(number[number.length - 1]);
        System.out.println(Arrays.toString(number));
    }
}
