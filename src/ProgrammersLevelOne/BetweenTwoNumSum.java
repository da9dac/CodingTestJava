package ProgrammersLevelOne;

public class BetweenTwoNumSum {
    public static void main(String[] args) {
        // 두 정수 사이의 합
        int a = 3, b = 5;
        long answer = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }

        System.out.println(answer);
    }
}
