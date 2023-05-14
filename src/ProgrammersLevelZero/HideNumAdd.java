package ProgrammersLevelZero;

public class HideNumAdd {
    public static void main(String[] args) {
        // 숨어있는 숫자의 덧셈 (1)
        String my_string = "1a2b3c4d123";

        /*
        문자열에서 숫자를 먼저 찾아야함
        일단 charAt으로 문자를 하나하나 꺼내고
        '0'을 빼서 10보다 작으면 숫자로 취급하고 더하기
         */
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) - '0' < 10) {
                answer += my_string.charAt(i) - '0';
            }
        }

        System.out.println(answer);
    }
}
