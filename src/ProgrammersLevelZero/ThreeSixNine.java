package ProgrammersLevelZero;

public class ThreeSixNine {
    public static void main(String[] args) {
        // 369게임
        int answer = 0;
        int order = 29423;
        String list = String.valueOf(order);

        for (int i = 0; i < list.length(); i++) {
            if(list.charAt(i) - '0' == 3 || list.charAt(i) - '0' == 6 || list.charAt(i) - '0' == 9) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
