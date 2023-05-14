package ProgrammersLevelZero;

import java.util.Arrays;

public class PolynomialAdd {
    public static void main(String[] args) {
        // 다항식 더하기
        String polynomial = "9x + 9x + 3 + 3";

        String[] poly = polynomial.split(" ");

        int x = 0;
        int num = 0;

        for(String p : poly) {
            if(p.contains("x")) {
                if(p.length() == 1) {
                    x += 1;
                } else {
                    x += Integer.parseInt(p.substring(0,p.length() - 1));
                }
            } else if(!(p.equals("+"))){
                num += Integer.parseInt(p);
            }
        }

        StringBuilder answer = new StringBuilder();
        if(x > 1) {
            answer.append(x);
        }
        if(polynomial.contains("x")){
            answer.append("x");
        }
        if(num > 0) {
            if(polynomial.contains("x")) {
                answer.append(" + ");
            }
            answer.append(num);
        }
        if(num == 0 && answer.length() == 0) {
            answer.append(0);
        }

        System.out.println(answer);

        //문자 숫자, 숫자 숫자, 문자 문자,
    }
}
