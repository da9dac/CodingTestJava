package ProgrammersLevelZero;

public class StringRepeat {
    public static void main(String[] args) {
        // 문자 반복 출력하기
        String my_string = "hello";
        String answer = "";
        int n = 3;

        for (int i = 0; i < my_string.length(); i++) {
            for (int x = 0; x < n; x++) {
                answer += String.valueOf(my_string.charAt(i));
            }
        }

        System.out.println(answer);
    }
}
