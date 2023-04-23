import java.util.ArrayList;
import java.util.Arrays;

public class NDouble {
    public static void main(String[] args) {
        // n의 배수 고르기
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        for (int num : numlist) {
            if (num % n == 0) {
                 answerList.add(num);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        System.out.println(Arrays.toString(answer));
    }
}
