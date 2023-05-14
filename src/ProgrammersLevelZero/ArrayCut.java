package ProgrammersLevelZero;

import java.util.Arrays;

public class ArrayCut {
    public static void main(String[] args) {
        // 배열 자르기
        int num1 = 1, num2 = 3;
        int[] numbers = {1,2,3,4,5};

        // 배열의 길이는 1부터 3번 인덱스까지 복사한다치면 3이니
        // num2 - num1 + 1
        int[] result = new int[num2-num1+1];

        System.arraycopy(numbers,num1,result,0,result.length);

        System.out.println(Arrays.toString(result));
    }
}
