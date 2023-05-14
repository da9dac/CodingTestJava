package ProgrammersLevelOne;

public class GetCenterStr {
    public static void main(String[] args) {
        // 가운데 글자 가져오기
        String s = "abcde";
        StringBuilder answer = new StringBuilder();
        int count = s.length() % 2 == 0 ? 2 : 1;

        if(count == 1) {
            answer.append(s.charAt(s.length()/2));
        } else {
            answer.append(s.charAt(s.length()/2 - 1));
            answer.append(s.charAt(s.length()/2));
        }

        System.out.println(answer);
    }
}
