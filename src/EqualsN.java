public class EqualsN {
    public static void main(String[] args) {
        // 중복된 숫자 개수
        int[] array = {1,1,2,3,4,5};
        int n = 1, count = 0;

        for (int arrays : array) {
            if (arrays == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
