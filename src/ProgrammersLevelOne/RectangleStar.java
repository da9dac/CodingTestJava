package ProgrammersLevelOne;

public class RectangleStar {
    public static void main(String[] args) {
        // 직사각형 별찍기
        int a = 5;
        int b = 3;

        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }
    }
}
