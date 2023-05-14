package ProgrammersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorizationOfFactors {
    public static void main(String[] args) {
        // 소인수분해
        // 주어진 수를 소인수분해 하여 소인수를 오름차순으로 담은 배열 리턴
        // Arrays.sort 사용
        int n = 12;
        ArrayList<Integer> n_list = new ArrayList<Integer>();

        while (n >= 2) {
            for (int i = 2; i < 10000; i++) {
                if(n % i == 0) {
                    n /= i;
                    if (!(n_list.contains(i))) {
                        n_list.add(i);
                    }
                    break;
                }
            }
        }

        int[] answer = new int[n_list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = n_list.get(i);
        }

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));
    }
}
