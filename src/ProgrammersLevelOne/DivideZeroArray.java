package ProgrammersLevelOne;
import java.util.Arrays;

public class DivideZeroArray {
    public static void main(String[] args) {
        // 나누어 떨어지는 숫자 배열
        int[] arr = {6};
        int divisor = 5;

        int[] answer = Arrays.stream(arr)
                .sorted()
                .filter(a -> a % divisor == 0)
                .toArray();

        if(answer.length == 0) {
            System.out.println(Arrays.toString(new int[]{-1}));
        } else {
            System.out.println(Arrays.toString(answer));
        }
    }
}
