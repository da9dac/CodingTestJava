package ProgrammersLevelZero;

import java.util.ArrayList;
import java.util.Collections;

public class StringPush {
    public static void main(String[] args) {
        // 문자열 밀기
        String A = "hello";
        String B = "ohell";
        int count = 0;

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < A.length(); i++) {
            list.add(String.valueOf(A.charAt(i)));
        }

        System.out.println(list);

        while (count < A.length()) {
            StringBuilder sb = new StringBuilder();
            if(A.equals(B)) {
                break;
            }

            Collections.rotate(list, 1);
            for (int  i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
            System.out.println(sb);
            count++;

            if(sb.toString().equals(B)) {
                break;
            }
            if (count == A.length() - 1) {
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}
