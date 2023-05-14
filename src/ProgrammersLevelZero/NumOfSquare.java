package ProgrammersLevelZero;

public class NumOfSquare {
    public static void main(String[] args) {
        // 제곱수 판별하기
        /*
        제곱근을 먼저 구한다
        제곱근이 정수인지 확인
         */

        int n = 144;
        if (Math.sqrt((double)n)%1 == 0) { //제곱근이 정수인지 확인
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
