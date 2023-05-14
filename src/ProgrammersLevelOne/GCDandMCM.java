package ProgrammersLevelOne;

import java.math.BigInteger;
import java.util.Arrays;

public class GCDandMCM {
    public static void main(String[] args) {
        // 최대공약수와 최소공배수
        int n = 3, m = 12;
        int[] answer = new int[2];

        BigInteger a = BigInteger.valueOf(n);
        BigInteger b = BigInteger.valueOf(m);

        answer[0] = a.gcd(b).intValue();
        answer[1] = n * m / answer[0];

        System.out.println(Arrays.toString(answer));
    }
}
