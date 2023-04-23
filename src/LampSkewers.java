public class LampSkewers {
    public static void main(String[] args) {
        // 양꼬치
        int n = 64, k = 6;

//        양꼬치 12000원 / 쥬스 2000원
        int lamb = 12000, juice = 2000;
//        1. 원가격 (12000 * n + 2000 * k)
        int default_fee = (lamb * n) + (juice * k);
//        2. 양꼬치를 10개 이상 먹었다면 n을 10으로 나눠서 몫을 구함
//        (여기서 몫은 서비스로 먹은 쥬스의 개수)
        int j = 0; // 서비스 쥬스의 개수를 담을 변수
//        3. 몫만큼 공짜로 먹은 음료값을 원가격에서 빼줌 = 원가격 - (몫 * 쥬스값)
        if (n >= 10) {
            j = n / 10 ;
            System.out.println(default_fee-(j * juice));
        }
//        4. 10개 이상 먹지 않았다면 원가격 그대로 계산
        else {
            System.out.println(default_fee);
        }
    }
}
