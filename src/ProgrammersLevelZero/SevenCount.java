package ProgrammersLevelZero;

public class SevenCount {
    public static void main(String[] args) {
        // 7의 개수
        int[] array = {7, 77, 17};
        int answer = 0;

        for (int arr : array) {
            while (arr >= 7) {
                if (arr % 10 == 7) {
                    arr /= 10;
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
