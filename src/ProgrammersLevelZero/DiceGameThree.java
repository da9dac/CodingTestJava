package ProgrammersLevelZero;

import java.util.Arrays;

public class DiceGameThree {
    public static void main(String[] args) {
        // 주사위 게임 3
        /*
        모두 다르면 가장 작은 숫자만큼
         */

        int a = 2, b = 5, c = 2,  d = 6;
        int answer = 0;
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        if(dice[0] == dice[3]) {
            answer = 1111 * dice[0];
        } else if (dice[0] == dice[2]) {
            answer = (int) Math.pow((10 * dice[0] + dice[3]), 2);
        } else if (dice[1] == dice[3]) {
            answer = (int) Math.pow((10 * dice[1] + dice[0]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        } else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } else {
            answer = dice[0];
        }

        System.out.println(answer);
    }
}
