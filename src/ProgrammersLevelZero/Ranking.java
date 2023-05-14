package ProgrammersLevelZero;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        // 등수 매기기
        int[][] score = {{80, 70}, {30,10},{70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[][] list = new int[score.length][2];
        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            list[i][0] = (score[i][0]+score[i][1]);
            list[i][1] = i+1;
        }

        Arrays.sort(list, Comparator.comparingInt(a -> a[0]));

        int rank = 1;
        int count = 0;

        for(int i = score.length - 1; i >= 0; i--) {
            if(i != score.length - 1 && (list[i][0] == list[i+1][0])) {
                answer[list[i][1] - 1] = count;
                rank++;
            } else {
                answer[list[i][1] - 1] = rank;
                rank++;
            }
            count = answer[list[i][1] - 1];
        }

        System.out.println(Arrays.toString(answer));
    }
}
