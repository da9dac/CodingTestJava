package ProgrammersLevelZero;

public class CurseOfThree {
    public static void main(String[] args) {
        // 저주의 숫자 3
        int n = 15;
        int count = 0;

        for (int i  = 1; i <= n; i++) {
            if(String.valueOf(i).contains("3")) {
                n++;
            } else if(i % 3 == 0) {
                n++;
            }
        }
        int answer = n;
        System.out.println(count);
        System.out.println(answer);
    }
}
