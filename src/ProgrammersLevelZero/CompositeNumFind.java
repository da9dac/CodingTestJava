package ProgrammersLevelZero;

public class CompositeNumFind {
    public static void main(String[] args) {
        // 합성수 찾기
        int n = 10;
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int count = 0;
            for (int x = 1; x <= i; x++) {
                if (i % x == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
