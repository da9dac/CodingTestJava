public class AntArmy {
    public static void main(String[] args) {
        // 개미 군단

        /*
        체력에 딱 맞는 병력
        장군 5 병정 3 일개미 1
        최소한의 병력
         */

        int n = 2;
        int answer = 0;

        if (n < 5) {
            if ( n < 3) {
                answer = n;
            }
            else {
                answer = n % 3 + 1;
            }
        } else {
            if (n % 5 == 0) {
                answer += n/5;
            } else {
                answer += n/5;
                answer += (n%5)/3;
                answer += (n%5)%3;
            }
        }

        System.out.println(answer);
    }
}
