package ProgrammersLevelZero;

import java.util.Arrays;
import java.util.Comparator;

public class UniqueSort {
    public static void main(String[] args) {
        // 특이한 정렬
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int[] answer = new int[numlist.length];
        int n = 30;

        int[][] arr = new int[numlist.length][2];
        //36, 40, 20, 47, 10, 6, 7000, 10000

        for (int i = 0; i < numlist.length; i++) {
            arr[i][0] = Math.abs(numlist[i] - n);
            arr[i][1] = numlist[i];
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                if(arr[i][0] == arr[i+1][0]) {
                    answer[i+1] = Math.min(arr[i][1], arr[i+1][1]);
                    answer[i] = Math.max(arr[i][1], arr[i+1][1]);
                    i++;
                } else {
                    answer[i] = arr[i][1];
                }
            } else {
                answer[i] = arr[i][1];
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
