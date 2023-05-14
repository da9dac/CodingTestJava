package ProgrammersLevelOne;

import java.util.HashMap;

public class MinusPlusAdd {
    public static void main(String[] args) {
        // 음양 더하기
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};
        int answer = 0;

        for(int i = 0; i < signs.length; i++) {
            answer = (signs[i] ? answer + absolutes[i] : answer - absolutes[i]);
        }

        System.out.println(answer);
    }
}
