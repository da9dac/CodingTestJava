package ProgrammersLevelZero;

import java.util.Arrays;

public class StringCalculator {
    public static void main(String[] args) {
        // 문자열 계산하기
        //my_string의 숫자와 연산자는 공백 하나로 구분
        //split(" ") 사용하면 될듯?

        String my_string = "3 - 4 + 10 - 7 - 3 - 4";

        String[] strs = my_string.split(" ");
        int x = Integer.parseInt(strs[0]), y = Integer.parseInt(strs[2]), sum = 0;

        if (strs[1].equals("+")) {
            sum = x + y;
        } else {
            sum = x - y;
        }

        for (int i = 4; i < strs.length; i += 2) {
            if (strs[i - 1].equals("+")) {
                sum += Integer.parseInt(strs[i]);
            } else if (strs[i - 1].equals("-")) {
                sum -= Integer.parseInt(strs[i]);
            }
        }

        System.out.println(sum);
    }
}
