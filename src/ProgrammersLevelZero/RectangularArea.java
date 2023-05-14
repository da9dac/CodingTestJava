package ProgrammersLevelZero;

public class RectangularArea {
    public static void main(String[] args) {
        //직사각형 넓이 구하기
        int[][] dots = {{1,1},{-1,-1},{-1,1},{1,-1}};
        int length = 0, heigth = 0;
        int x = dots[0][0];
        int y = dots[0][1];

        for (int i = 1; i < 4; i++) {
            if(x == dots[i][0]) {
                heigth = Math.abs(y - dots[i][1]);
            }
            if(y == dots[i][1]) {
                length = Math.abs(x - dots[i][0]);
            }
        }

        System.out.println(length * heigth);
    }
}
