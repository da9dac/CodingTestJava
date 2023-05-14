package ProgrammersLevelOne;

import java.util.Arrays;
import java.util.Comparator;

public class StringReverseSort {
    public static void main(String[] args) {
        // 문자열 내림차순으로 배치하기
        String s = "Zbcdefg";
        String[] strs = s.split("");
        Arrays.sort(strs, Comparator.reverseOrder());
        StringBuilder answer = new StringBuilder();

        for (String str : strs) {
            answer.append(str);
        }

        System.out.println(answer);
    }
}
