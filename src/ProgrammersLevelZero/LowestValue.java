package ProgrammersLevelZero;

import java.util.Arrays;
import java.util.Comparator;

public class LowestValue {
    public static void main(String[] args) {
        // 최빈값 구하기
        // 최빈값 = 가장 자주 나오는 수
        int[] array = {0,0,0}; // 3
        int answer = 0;

        if(array.length == 1) {
            answer = array[0];
        } else {
            int[] arr = Arrays.stream(array)
                    .distinct()
                    .toArray();

            int[][] count = new int[arr.length][2];

            for (int i = 0; i < count.length; i++) {
                int finalI = i;
                count[i][1] = arr[i]; //숫자
                count[i][0] = (int) Arrays.stream(array)
                        .filter(n -> n == arr[finalI])
                        .count(); //카운트

            }

            Arrays.sort(count, Comparator.comparingInt(x -> x[0]));
            for (int[] sss : count) {
                System.out.println(sss[0] + "," + sss[1]);
            }

            if(count.length == 1) {
                answer = array[0];
            } else {
                if (count[count.length - 1][0] != count[count.length - 2][0]) {
                    answer = count[count.length - 1][1];
                } else {
                    answer = -1;
                }
            }
        }

        System.out.println(answer);
    }
}
