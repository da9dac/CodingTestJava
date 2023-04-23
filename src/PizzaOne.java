public class PizzaOne {
    public static void main(String[] args) {
        // 피자 나워 먹기 (1)
        int n = 1;
        int pizza = 7;
        int answer = 0;

        if (n % pizza == 0) {
            answer = n / pizza;
        }
        else {
            answer = n / pizza + 1;
        }

        System.out.println(answer);
    }
}
