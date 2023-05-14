package ProgrammersLevelOne;

import java.util.Arrays;

public class IntervalX {
    public static void main(String[] args) {
        // x만큼 간격이 있는 n개의 숫자
        int x = -10000000, n = 0;
        long[] answer = new long[n];

        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long) i * x;
        }

        System.out.println(Arrays.toString(answer));
    }
}
