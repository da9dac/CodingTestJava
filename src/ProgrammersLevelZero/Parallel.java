package ProgrammersLevelZero;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Parallel {
    public static void main(String[] args) {
        // 평행
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int answer = 0;

        /*
        1. 평행이 되는 경우가 있으면 1, 없으면 0
        2. 서로 다른 두개 이상의 점이 겹치는 경우 없음
        3. 두 직선이 겹치는 경우도 1
         */

        int xa = dots[0][0];
        int ya = dots[0][1];
        int xb = dots[1][0];
        int yb = dots[1][1];
        int xc = dots[2][0];
        int yc = dots[2][1];
        int xd = dots[3][0];
        int yd = dots[3][1];

        double[] lean = new double[6];

        lean[0] = (double) (ya - yb) / (xa - xb);
        lean[1] = (double) (ya - yc) / (xa - xc);
        lean[2] = (double) (ya - yd) / (xa - xd);
        lean[3] = (double) (yb - yc) / (xb - xc);
        lean[4] = (double) (yb - yd) / (xb - xd);
        lean[5] = (double) (yc - yd) / (xc - xd);

        if(lean[0] == lean[5] || lean[1] == lean[4] || lean[2] == lean[3]) {
            answer = 1;
        }

        System.out.println(answer);
    }
}
