public class EvenAdd {
    public static void main(String[] args) {
        //짝수의 합
        int n = 10;
        int even_sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even_sum += i;
            }
        }

        System.out.println(even_sum);
    }
}
