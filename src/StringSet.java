import java.util.Arrays;

public class StringSet {
    public static void main(String[] args) {
        // 문자열 정렬하기 (1)
        /*
        먼저 숫자를 골라냄
        오름차순으로 정렬
         */
        String my_string = "p2o4i8gj2";
        StringBuilder list = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i)-'0' < 10) {
                list.append(my_string.charAt(i)-'0');
            }
        }
        int[] answer = new int[list.length()];
        for (int i = 0; i < list.length(); i++) {
            answer[i] = list.charAt(i) - '0';
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
