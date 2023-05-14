package ProgrammersLevelZero;

import java.util.Arrays;

public class HateEven {
    public static void main(String[] args) {
        // 짝수는 싫어요
        int n = 13;
        int length = n / 2 + 1;
        if (n % 2 == 0) {
            length = n / 2;
        }
        int[] answer = new int[length];
        int count = 0;

        for (int i = 1; i <= n; i+=2) {
            answer[count] = i;
            count++;
        }
        System.out.println(Arrays.toString(answer));
    }
}
