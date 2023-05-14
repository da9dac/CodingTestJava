package ProgrammersLevelZero;

public class PaperCut {
    public static void main(String[] args) {
        // 종이 자르기
        int m = 2, n = 5;
        int answer = 0;

        if (m <= n) {
            answer += (m - 1) + ((n - 1) * m);
        } else {
            answer += (n - 1) + ((m - 1) * n);
        }

        System.out.println(answer);
    }
}
