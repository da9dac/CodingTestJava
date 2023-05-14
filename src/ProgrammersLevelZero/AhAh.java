package ProgrammersLevelZero;

import java.util.Arrays;

public class AhAh {
    public static void main(String[] args) {
        // 아이스 아메리카노
        int cost = 5500;
        int money = 15000;
        int[] answer = new int[2];


        answer[0] = money / cost;
        answer[1] = money % cost;

        System.out.println(Arrays.toString(answer));
    }
}
