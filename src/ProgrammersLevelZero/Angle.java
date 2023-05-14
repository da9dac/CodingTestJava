package ProgrammersLevelZero;

public class Angle {
    public static void main(String[] args) {
        // 각도기
        int angle = 180;
        if (angle > 0 && angle < 90) {
            System.out.println(1);
        } else if (angle == 90) {
            System.out.println(2);
        } else if (angle > 90 && angle < 180) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
