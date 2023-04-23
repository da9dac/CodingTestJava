public class StringReverse {
    public static void main(String[] args) {
        // 문자열 뒤집기
        String my_string = "jaron";
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            answer += String.valueOf(my_string.charAt(my_string.length()-i-1));
        }

        System.out.println(answer);
    }
}
