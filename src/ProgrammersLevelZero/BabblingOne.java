package ProgrammersLevelZero;

import java.util.ArrayList;

public class BabblingOne {
    public static void main(String[] args) {
        // 옹알이 (1)
        // "aya", "ye", "woo", "ma" 각각 최대 한 번씩만
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] possible = {"aya", "ye", "woo", "ma"};

        int answer = 0;

        for(String b : babbling) {
            for(String p : possible) {
                b = b.replace(p, " ");
            }
            String[] s = b.split(" ");
            if (s.length == 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
