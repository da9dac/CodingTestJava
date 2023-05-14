package ProgrammersLevelZero;

import java.util.ArrayList;

public class EqualStringDel {
    public static void main(String[] args) {
        // 중복된 문자 제거
        /*
        공백도 문자로 구분
        대문사와 소문자 구분

         */
        String my_string = "We are the world";
        char[] strs = my_string.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        list.add(String.valueOf(strs[0]));

        for (char str : strs) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(String.valueOf(str))) {
                    break;
                }
                count++;
            }
            if (count == list.size()) {
                list.add(String.valueOf(str));
            }
        }

        StringBuilder answer = new StringBuilder();
        for (String s : list) {
            answer.append(s);
        }

        System.out.println(answer);
    }
}
