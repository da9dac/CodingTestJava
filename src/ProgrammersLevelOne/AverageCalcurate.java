package ProgrammersLevelOne;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageCalcurate {
    public static void main(String[] args) {
        // 평균 구하기
        int[] arr = {1,2,3,4};
//        int sum = 0;
//
//        for (int a : arr) {
//            sum += a;
//        }
//
//        double answer = (double) sum / arr.length;

        double answer = Arrays.stream(arr)
                        .average().orElse(0);

        System.out.println(answer);
    }
}
