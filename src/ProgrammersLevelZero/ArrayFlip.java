package ProgrammersLevelZero;

import java.util.Arrays;

public class ArrayFlip {
    public static void main(String[] args) {
        // 배열 뒤집기
        int[] num_list = {1,2,3,4,5};
        int[] result = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            //새로운 배열의 끝 인덱스부터 원본 배열의 첫 인덱스부터의 값을 넣기
            result[num_list.length-i-1] = num_list[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
