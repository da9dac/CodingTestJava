package ProgrammersLevelZero;

public class BacteriaAdd {
    public static void main(String[] args) {
        // 세균 증식
        // 1시간에 두배

        int n = 2;
        int t = 10;

        for (int i = 1; i <= t; i++) {
            n *= 2;
        }

        System.out.println(n);
    }
}
