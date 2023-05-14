package ProgrammersLevelZero;

import java.util.Arrays;

public class TriangleCompleteB {
    public static void main(String[] args) {
        // 삼각형의 완성조건 (2)
        // 가장 긴 변의 길이 < 다른 두 변의 길이의 합

        int[] sides = {11, 7};
        int answer = 0;

        Arrays.sort(sides);

        for (int i = sides[1]; i >= sides[1] - sides[0] + 1; i--) {
            answer++;
        }
        for (int x = sides[1] + 1; x < sides[0] + sides[1]; x++) {
            answer++;
        }

        System.out.println((sides[1] - (sides[1] - sides[0])) + ((sides[0] + sides[1]) - (sides[1] + 1)));

        System.out.println(answer);
    }
}
