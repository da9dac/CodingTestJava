package ProgrammersLevelOne;

public class BasicStrControl {
    public static void main(String[] args) {
        // 문자열 다루기 기본
        String s = "a234";
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) -'0' > 9) {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
