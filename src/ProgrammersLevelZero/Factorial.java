package ProgrammersLevelZero;

public class Factorial {
    public static void main(String[] args) {
        //팩토리얼
        int n = 3628800;
        int answer = 1;
        int start = 2;
        //1 2 6 24
        while (answer <= n) {
            answer *= start;
            if (answer == n && answer < n) {
                break;
            }
            start++;
        }

        System.out.println(start);
    }
}
