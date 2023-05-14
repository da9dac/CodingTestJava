package ProgrammersLevelOne;

import java.util.Arrays;
import java.util.Comparator;

public class IntReverseSort {
    public static void main(String[] args) {
        // 정수 내림차순으로 배치하기
        long n = 118372;

        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String s : str) {
            sb.append(s);
        }

        long answer = Long.parseLong(sb.toString());

        System.out.println(answer);
    }
}
