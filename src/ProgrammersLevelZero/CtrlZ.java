package ProgrammersLevelZero;

public class CtrlZ {
    public static void main(String[] args) {
        // 컨트롤 제트
        // 문자열에 있는 숫자를 더하는데
        // Z가 나오면 전에 더했던 숫자를 뺌
        String s = "-1 -2 -3 Z";
        String[] strs = s.split(" ");
        int answer = 0;
        int num = 0;

        for (String str : strs) {
            if(str.equals("Z")) {
                answer -= num;
            } else {
                num = Integer.parseInt(str);
                answer += num;
            }
        }

        System.out.println(answer);
    }
}
