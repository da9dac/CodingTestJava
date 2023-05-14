package ProgrammersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;

public class OneString {
    public static void main(String[] args) {
        // 한 번만 등장한 문자
        String s = "hello";
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                str.append(String.valueOf(ch));
            }
        }

        String[] str_array = str.toString().split("");
        Arrays.sort(str_array);
        str.delete(0,str.length());

        for (int i = 0; i < str_array.length; i++) {
            str.append(str_array[i]);
        }

        System.out.println(Arrays.toString(str_array));
        System.out.println(str); //97 ~ 122

    }

    /*
    indexOf(int ch) : 지정한 문자 또는 문자열이 현재 문자열에서
    처음으로 나타나는 인덱스를 반환합니다.

    lastIndexOf(int ch) : 지정한 문자 또는 문자열이 현재 문자열에서
    마지막으로 나타나는 인덱스를 반환합니다.
     */
}
