public class AaReverse {
    public static void main(String[] args) {
        // 대문자와 소문자
        String my_string = "abCdEfghIJ";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) > 'Z') {
                answer.append((char)(my_string.charAt(i)-32));
            }
            else {
                answer.append((char)(my_string.charAt(i)+32));
            }
        }

        System.out.println(answer.toString());
    }
}
