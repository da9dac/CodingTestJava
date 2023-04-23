import java.util.Arrays;

public class EvenOddNum {
    public static void main(String[] args) {
        // 짝수 홀수 개수
        int[] num_list = {1, 3, 5, 7};
        int[] even_odd = {0,0};

        for (int num : num_list) {
            if (num % 2 == 0) {
                even_odd[0] += 1;
            }
            else{
                even_odd[1] += 1;
            }
        }

        System.out.println(Arrays.toString(even_odd));
    }
}
