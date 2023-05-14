package ProgrammersLevelOne;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        // 예산
        /*
        최대한 많은 부서
        각 부서가 신청한 금액만큼 모두 해줘야 함
         */
        int[] d = {2,2,3,3};
        int budget = 10;
        int answer = 0;

        Arrays.sort(d);

        for (int b : d) {
            budget -= b;
            if(budget >= 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
