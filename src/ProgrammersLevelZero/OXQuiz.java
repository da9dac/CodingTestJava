package ProgrammersLevelZero;

import java.util.Arrays;

public class OXQuiz {
    public static void main(String[] args) {
        // OX퀴즈
        String[] quiz = {
                "19 - 6 = 13", "5 + 66 = 71",
                "5 - 15 = 63", "3 - 1 = 2"
        };

        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[2]);
            int z = Integer.parseInt(arr[4]);
            int result = 0;

            switch (arr[1]) {
                case "+": {
                    result = x + y;
                    break;
                }
                case "-": {
                    result = x - y;
                    break;
                }
            }

            if(result == z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
