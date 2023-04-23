import java.util.Arrays;

public class CenterNumber {
    public static void main(String[] args) {
        // 중앙값 구하기
        int[] array = {1, 2, 7, 10, 11};
        Arrays.sort(array);

        System.out.println(array[array.length/2]);
    }
}
