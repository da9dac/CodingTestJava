package ProgrammersLevelZero;

public class DotLocation {
    public static void main(String[] args) {
        // 점의 위치 구하기
        //int[] dot = {2,4}; // x y
        int[] dot = {-7,9};

        if (dot[0] > 0 && dot[1] > 0) {
            System.out.println("1사분면");
        }
        else if (dot[0] < 0 && dot[1] > 0) {
            System.out.println("2사분면");
        }
        else if (dot[0] < 0 && dot[1] < 0) {
            System.out.println("3사분면");
        }
        else {
            System.out.println("4사분면");
        }
    }
}
