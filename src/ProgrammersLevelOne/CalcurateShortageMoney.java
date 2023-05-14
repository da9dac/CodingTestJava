package ProgrammersLevelOne;

public class CalcurateShortageMoney {
    public static void main(String[] args) {
        // 부족한 금액 계산하기
        int price = 3, money = 20, count = 4;
        long answer = money;

        for (int i = 1; i <= count; i++) {
            answer -= (price * i);
        }

        if(answer >= 0) {
            answer = 0;
        }

        System.out.println(Math.abs(answer));
    }
}