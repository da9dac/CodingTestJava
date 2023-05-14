package ProgrammersLevelOne;

public class CollatzConjecture {
    public static void main(String[] args) {
        // 콜라츠 추측
        int num = 1;
        double x = num;
        int answer = 0;

        while (x != 1) {
            if(x % 2 == 0) {
                x /= 2;
            } else {
                x = (x * 3) + 1;
            }
            answer++;
            if(answer > 500) {
                answer = -1;
                break;
            }
        }

        System.out.println(answer);
    }
}
