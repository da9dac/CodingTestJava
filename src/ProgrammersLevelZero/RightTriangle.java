package ProgrammersLevelZero;

public class RightTriangle {
    public static void main(String[] args) {
        // 직각삼각형 출력하기
        int n = 3;
        for (int x = 1; x <= n; x++) {
            if (x != 1) {
                System.out.println();
            }
            for (int y = 0; y < x; y++) {
                System.out.print("*");
            }
        }
    }
}
