package ProgrammersLevelZero;

public class TwoDmake {
    public static void main(String[] args) {
        //2차원으로 만들기
        int n = 3;
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int[][] answer = new int[num_list.length/n][n];
        int count = 0;

        for (int x = 0; x < answer.length; x++) {
            for (int y = 0; y < n; y++) {
                answer[x][y] = num_list[count];
                count++;
            }
        }
    }
}
