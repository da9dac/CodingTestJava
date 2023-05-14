package ProgrammersLevelZero;

public class TwoNumDivision {
    public static void main(String[] args) {
        //두 수의 나눗셈
        double num1 = 7, num2 = 3;
        double division = (num1 / num2) * 1000;

        //강제 형변환을 이용한 소수 버리기
        System.out.println((int)(division));
        //주어진 값 이하의 가장 큰 정수를 반환하는 것을 이용
        System.out.println((int) Math.floor(division));

        /*
        * 프로그래머스 사이트에서 실행한 코드
        public int solution(int num1, int num2) {
        double n1 = num1, n2 = num2;
        double div = (n1 / n2) * 1000;
        int result = (int) div;
        return result;
        }
         */

        //새로 알게된거
        //강제형변환은 변수마다 지정 가능
        //(double) num1 / (double) num2 이런식으로
    }
}
