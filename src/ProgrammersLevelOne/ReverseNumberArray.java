package ProgrammersLevelOne;

import java.util.Arrays;

public class ReverseNumberArray {
    public static void main(String[] args) {
        // 자연수 뒤집어 배열로 만들기
        long n = 12345;
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            answer[count] = Integer.parseInt(str.charAt(i) + "");
            count++;
        }

        System.out.println(Arrays.toString(answer));
    }
}
