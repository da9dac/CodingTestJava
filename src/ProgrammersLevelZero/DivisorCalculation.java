package ProgrammersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisorCalculation {
    public static void main(String[] args) {
        // 약수 구하기
        int n = 24;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
    }
}
