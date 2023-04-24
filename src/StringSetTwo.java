import java.util.Arrays;

public class StringSetTwo {
    public static void main(String[] args) {
        // 문자열 정렬하기 (2)
        String my_string = "heLLo";
        /*
        먼저 모두 소문자로 바꾸기
        알파벳 순서대로 정렬
         */
        //System.out.println('a'-'A');
        StringBuilder str_b = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) < 'a') {
                str_b.append((char) (my_string.charAt(i) + 32));
            } else {
                str_b.append(my_string.charAt(i));
            }
        }

        char[] charArray = (str_b.toString()).toCharArray();
        Arrays.sort(charArray);

        String answer = new String(charArray);

        System.out.println(answer);
    }
}
