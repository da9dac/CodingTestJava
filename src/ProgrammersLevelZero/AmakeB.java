package ProgrammersLevelZero;

import java.util.Arrays;

public class AmakeB {
    //에프터 비포
    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";

        char[] b_array = before.toCharArray();
        char[] a_array = after.toCharArray();

        Arrays.sort(b_array);
        Arrays.sort(a_array);

        for (int i = 0; i < b_array.length; i++) {
            if(b_array[i] != a_array[i]) {
                System.out.println(0);
                break;
            }else {
                System.out.println(1);
            }
        }
    }
}
