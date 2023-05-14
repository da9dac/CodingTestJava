package ProgrammersLevelZero;

public class NextNumber {
    public static void main(String[] args) {
        // 다음에 올 숫자
        int[] common = {1,2,3,4};
        int answer = 0;
        int x = common[common.length - 1];

        if (common[1] - common[0] == common[2] - common[1]) {
            answer = x + (x - common[common.length - 2]);
        } else {
            answer = x * (x/common[common.length - 2]);
        }

        System.out.println(answer);
    }
}
