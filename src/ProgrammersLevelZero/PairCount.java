package ProgrammersLevelZero;

public class PairCount {
    public static void main(String[] args) {
        // 순서쌍의 개수
        // 나중에 다시 풀기
        int n = 1000;
        int count = 0;

        for (int x = 2; x <= n/2; x++) {
            for (int y = n/2; y >= 2; y--) {
                if (x * y == n) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}