package ProgrammersLevelZero;

public class DigitNumAdd {
    public static void main(String[] args) {
        // 자릿수 더하기
        int n = 930211;
        int answer = 0;
        //n의 값을 모드 스트링으로 바꿔줌
        String str = String.valueOf(n);

        //i번째 스트링 값에 문자0의 값을 빼줘서 answer에 더해줌
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }

        System.out.println(answer);
    }
}
