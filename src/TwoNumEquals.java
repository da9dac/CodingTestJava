public class TwoNumEquals {
    public static void main(String[] args) {
        //숫자 비교하기
        int num1 = 11, num2 = 1, num3 = 5, num4 = 5;

        if (num1 == num2) {
            System.out.println(1);
        }
        else {
            System.out.println(-1);
        }
        //삼항 연산자를 이용할 수도 있음
        System.out.println((num3 == num4) ? 1 : -1);
    }
}
