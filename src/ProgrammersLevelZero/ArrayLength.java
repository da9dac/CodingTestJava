package ProgrammersLevelZero;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        // 배열 원소의 길이
        String[] strlist = {"We", "are", "the", "world!"};
        int[] result = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            result[i] = strlist[i].length();
        }

        System.out.println(Arrays.toString(result));
    }
}
