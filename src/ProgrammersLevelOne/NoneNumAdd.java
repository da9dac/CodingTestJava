package ProgrammersLevelOne;

import java.util.Arrays;

public class NoneNumAdd {
    public static void main(String[] args) {
        // 없는 숫자 더하기
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 0;

        String str = Arrays.toString(numbers);

        for (int i = 1; i <= 9; i++) {
            if(!(str.contains(i + ""))) {
                answer += i;
            }
        }

        System.out.println(answer);
    }
}
