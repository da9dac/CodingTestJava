package ProgrammersLevelZero;

import java.math.BigInteger;

public class BeadDivision {
    public static void main(String[] args) {
        // 구슬을 나누는 경우의 수
        /*
        구슬이 모두 다를 때 balls개의 구슬 중 share개를 나눠주는 경우의 수
        서로 다른 n개 중 m개를 뽑는 경우의 수는
        n!/(n-m)!xm
         */
        //갖고 있는 구슬과 나누어 줄 개수

        int balls = 30, share = 15;

        BigInteger ball = BigInteger.valueOf(balls);

        BigInteger nf = BigInteger.valueOf(1);
        BigInteger mf = BigInteger.valueOf(1);
        BigInteger nmf = BigInteger.valueOf(1);

        for(int i = 1; i <= balls; i++) {
            nf = nf.multiply(BigInteger.valueOf(i));
        }
        for (int m = 1; m <= share; m++) {
            mf = mf.multiply(BigInteger.valueOf(m));
        }
        for (int nm = 1; nm <= balls-share; nm++) {
            nmf = nmf.multiply(BigInteger.valueOf(nm));
        }

        int x = (nf.divide(nmf.multiply(mf))).intValue();

        System.out.println(x);
    }
}
