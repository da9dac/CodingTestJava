package ProgrammersLevelZero;

import java.util.ArrayList;

public class TailString {
    public static void main(String[] args) {
        // 꼬리 문자열
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        StringBuilder answer = new StringBuilder();

        for (String str : str_list) {
            if (!(str.contains(ex))) {
                answer.append(str);
            }
        }

        System.out.println(answer);
    }
}
