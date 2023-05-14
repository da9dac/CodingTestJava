package ProgrammersLevelZero;

public class MaxMake {
    public static void main(String[] args) {
        // 최댓값 만들기
        int[] numbers = {0, 31, 24, 10, 1, 9};
        int[] num = new int[2];

        // 가장 큰값 * 다음으로 큰값
        for (int number : numbers) {
            if (number > num[0]) {
                num[1] = num[0];
                num[0] = number;
            }
            else if (number > num[1]) {
                num[1] = number;
            }
        }
        System.out.println(num[0] * num[1]);
    }
}
