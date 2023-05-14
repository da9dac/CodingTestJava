package ProgrammersLevelOne;

import java.util.Arrays;

public class StrangeString {
    public static void main(String[] args) {
        // 이상한 문자 만들기
        String s = "try hello world";
        StringBuilder answer = new StringBuilder();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(String.valueOf(s.charAt(i)).equals(" ")) {
                answer.append(" ");
                count = 0;
            } else {
                if(count % 2 == 0) {
                    answer.append(String.valueOf(s.charAt(i)).toUpperCase());
                } else {
                    answer.append(String.valueOf(s.charAt(i)).toLowerCase());
                }
                count++;
            }
        }

        System.out.println(answer);
    }
}
