package ProgrammersLevelZero;

public class NumFind {
    public static void main(String[] args) {
        // 숫자 찾기
        int answer = -1;
        int num = 29183, k = 1;
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' == k) {
                answer = i+1;
            }
        }

        System.out.println(answer);
    }
}
