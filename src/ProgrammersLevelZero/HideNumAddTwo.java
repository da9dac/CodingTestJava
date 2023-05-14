package ProgrammersLevelZero;

import java.util.Arrays;

public class HideNumAddTwo {
    public static void main(String[] args) {
        // 숨어있는 숫자의 덧셈 (2)
        String my_string = "aAb1B2cC34oOp";
        StringBuffer str = new StringBuffer();
        int answer = 0;


        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) > 47 && my_string.charAt(i) < 58) {
                str.append(my_string.charAt(i));
            } else {
                str.append(" ");
            }
        }

        String str_a = str.toString();
        String[] str_arrays = str_a.split(" ");

        for (String str_array : str_arrays) {
            if (!(str_array.equals(""))) {
                answer += Integer.parseInt(str_array);
            }
        }

        System.out.println(answer);
        //System.out.println((int) '9');//48 ~ 57
    }
}
