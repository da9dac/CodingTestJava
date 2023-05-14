package ProgrammersLevelOne;

import java.util.Arrays;

public class MinNumDelete {
    public static void main(String[] args) {
        // 제일 작은 수 제거하기
        int[] arr = {4,3,2,1};
        int[] answer = new int[arr.length - 1];
        int[] list = Arrays.copyOf(arr, arr.length);
        Arrays.sort(list);
        int i = 0;

        for(int a : arr) {
            if(a != list[0]) {
                answer[i] = a;
                i++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
