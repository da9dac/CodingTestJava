package ProgrammersLevelZero;

import java.math.BigInteger;
import java.util.Arrays;

public class FractionAdd {
    public static void main(String[] args) {
        // 분수의 덧셈
        int numer1 = 1, denom1 = 2, numer2 = 3, denom2 = 4;
        int[] answer = new int[2];

        if (denom1 != denom2) {
            int denom = denom1 * denom2;
            numer1 = numer1 * denom2;
            numer2 = numer2 * denom1;

            answer[0] = numer1 + numer2;
            answer[1] = denom;
        } else {
            answer[0] = numer1 + numer2;  // 분자
            answer[1] = denom1; // 분모
        }
        BigInteger x = BigInteger.valueOf(answer[1]);
        BigInteger y = BigInteger.valueOf(answer[0]);

        BigInteger gcd = x.gcd(y);
        answer[0] = answer[0] / gcd.intValue();
        answer[1] = answer[1] / gcd.intValue();

        System.out.println(Arrays.toString(answer));
    }
}
