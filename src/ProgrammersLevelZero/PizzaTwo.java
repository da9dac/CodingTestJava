package ProgrammersLevelZero;

public class PizzaTwo {
    public static void main(String[] args) {
        // 피자 나눠 먹기 (2)
        int n = 6;
        int x = 6;
        int answer = 1;

        while (x % n != 0) {
            x += 6;
            answer++;
        }

        System.out.println(answer);
    }
}
