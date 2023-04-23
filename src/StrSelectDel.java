public class StrSelectDel {
    public static void main(String[] args) {
        // 특정 문자 제거하기
        String my_string = "abcdef";
        String letter = "f";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (String.valueOf(my_string.charAt(i)).equals(letter)) {
                continue;
            }
            answer.append(my_string.charAt(i));
        }

        System.out.println(answer);
    }
}
