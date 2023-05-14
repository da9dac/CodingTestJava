package ProgrammersLevelZero;

public class LinesOverlapLLLLLast {
    public static void main(String[] args) {
        // 겹치는 선분의 길이 최종의 최종의 최종본
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        int answer = 0;

        int[] arr = new int[201];

        for(int[] line : lines) {
            for (int i = line[0] + 100; i < line[1] + 100; i++) {
                arr[i]++;
            }
        }

        for(int a : arr) {
            if(a > 1) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
