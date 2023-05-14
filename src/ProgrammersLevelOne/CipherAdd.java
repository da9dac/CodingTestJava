package ProgrammersLevelOne;

public class CipherAdd {
    public static void main(String[] args) {
        // 자릿수 더하기
        int n = 987;
        int answer = 0;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.charAt(i) + "");
        }

        System.out.println(answer);
    }
}
