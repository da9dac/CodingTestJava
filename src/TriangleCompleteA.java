import java.util.Arrays;

public class TriangleCompleteA {
    public static void main(String[] args) {
        // 삼각형의 완성조건 (1)
        int[] sides = {199, 72, 222};

        Arrays.sort(sides);

        if (sides[0]+sides[1] > sides[2]) {
            System.out.println(1);
        }
    }
}
