package ProgrammersLevelZero;

import java.math.BigInteger;

public class FiniteDecimal {
    public static void main(String[] args) {
        // 유한소수 판별하기
        /*
        기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재하면 유한소수
         */

        int a = 12, b = 21; //

        BigInteger x = BigInteger.valueOf(a); //분자
        BigInteger y = BigInteger.valueOf(b); //분모

        BigInteger g = y.gcd(x);
        int gcd = g.intValue();

        b /= gcd;

        int answer = 1;

        while (true) {
            if(b == 1) {
                break;
            }
            if(b >= 5 || b == 2 || b == 4) {
                if(b % 5 == 0) {
                    b /= 5;
                } else if (b % 2 == 0) {
                    b /= 2;
                } else {
                    answer = 2;
                    break;
                }
            } else {
                answer = 2;
                break;
            }
        }

        System.out.println(answer);
    }
}
