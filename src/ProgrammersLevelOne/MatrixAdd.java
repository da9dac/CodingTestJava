package ProgrammersLevelOne;

import java.util.Arrays;

public class MatrixAdd {
    public static void main(String[] args) {
        // 행렬의 덧셈
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = new int[arr1.length][arr1[0].length];

        int[] a1 = new int[arr1.length * arr1[0].length];
        int[] a2 = new int[arr2.length * arr2[0].length];

        int count = 0;
        for(int[] arr : arr1) {
            for (int i = 0; i < arr.length; i++) {
                a1[count] = arr[i];
                count++;
            }
        }

        count = 0;
        for(int[] arr : arr2) {
            for (int i = 0; i < arr.length; i++) {
                a2[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < a1.length; i++) {
            a1[i] += a2[i];
        }

        count = 0;
        int first = 0;
        for (int i = 0; i < a1.length; i++) {
            answer[first][count] = a1[i];
            count++;
            if(count == answer[0].length) {
                count = 0;
                first++;
            }
        }


        for (int[] arr : answer) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
