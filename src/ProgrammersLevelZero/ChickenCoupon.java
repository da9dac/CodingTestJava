package ProgrammersLevelZero;

public class ChickenCoupon {
    public static void main(String[] args) {
        /*
        쿠폰 10 = 치킨 1
        서비스 치킨에도 쿠폰 발급 가능 ( 쿠폰100 = 치킨 2)
         */
        int chicken = 100;
        int answer = 0; //108
        int service = 10; // 10마리당 1 추가니까

        while (chicken >= service) { //서비스를 못줄때까지
            int chic = chicken / service; // 108 //서비스
            int remain = chicken % service; // 1
            chicken = chic + remain;

            answer += chic;
        }

        System.out.println(answer);
    }
}
