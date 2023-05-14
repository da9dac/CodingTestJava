package ProgrammersLevelZero;

import java.util.Arrays;

public class ContinuousNum {
    public static void main(String[] args) {
        // 연속된 수의 합
        int num = 5;
        int total = 5;
        int count = total/num;
        int[] answer = new int[num];
        int s = 0;

        if(total % num == 0) {
            int x = num / 2;
            for(int i = count - x; i < count; i++) {
                answer[s] = i;
                s++;
            }
            for (int i = count; i <= count + x; i++) {
                answer[s] = i;
                s++;
            }
        } else {
            int x = num / 2;
            for(int i = count - x + 1; i < count; i++) {
                answer[s] = i;
                s++;
            }
            for (int i = count; i <= count + x; i++) {
                answer[s] = i;
                s++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
