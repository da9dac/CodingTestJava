package ProgrammersLevelOne;

public class SubMultipleCountAdd {
    public static void main(String[] args) {
        // 약수의 개수와 덧셈
        // 약수 개수가 짝수면 더하고 홀수면 빼기
        int left = 13, right = 17;
        int answer = 0;
        int count = 0;

        for (int x = left; x <= right; x++) {
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    count++;
                }
            }
            if(count % 2 == 0) {
                answer += x;
            } else {
                answer -= x;
            }
            count = 0;
        }

        System.out.println(answer);
    }
}
