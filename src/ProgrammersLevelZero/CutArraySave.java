package ProgrammersLevelZero;

import java.util.Arrays;

public class CutArraySave {
    public static void main(String[] args) {
        // 잘라서 배열로 저장하기
        String my_str = "abcdef123";
        int n = 3;
        int length = my_str.length() / n;
        if (my_str.length() % n != 0) {
            length = my_str.length() / n + 1;
        }
        String[] answer = new String[length];
        int i = 0;
        int count = 1;

        StringBuilder str = new StringBuilder();

        for (int x = 1; x <= length; x++) {
            for (int y = i; y < n * count; y++) {
                if (y == my_str.length()) {
                    break;
                }
                str.append(my_str.charAt(y));
            }
            answer[x-1] = str.toString();
            str.delete(0,str.length());
            i += n;
            count++;
        }

        System.out.println(Arrays.toString(answer));
    }
}
