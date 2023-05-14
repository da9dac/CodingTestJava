package ProgrammersLevelZero;

import java.util.Arrays;

public class CharacterXY {
    public static void main(String[] args) {
        // 캐릭터의 좌표
        String[] keyinput = {"left", "right", "up", "right", "right"}; // 입력한 방향키의 배열
        int[] board = {11, 11}; // 맵의 크기
        int[] max = {board[0]/2, board[1]/2};
        int[] answer = {0, 0};

        for (String key : keyinput) {
            switch (key) {
                case "up": {
                    if (max[1] != answer[1]) {
                        answer[1] += 1;
                    }
                    break;
                }
                case "down": {
                    if (-max[1] != answer[1]) {
                        answer[1] -= 1;
                    }
                    break;
                }
                case "left": {
                    if (-max[0] != answer[0]) {
                        answer[0] -= 1;
                    }
                    break;
                }
                case "right": {
                    if (max[0] != answer[0]) {
                        answer[0] += 1;
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
