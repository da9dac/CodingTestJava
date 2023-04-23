public class ClothDiscount {
    public static void main(String[] args) {
        // 옷가게 할인 받기
        /*
        10 이상 5% / 30이상 10% / 50 이상 20%
         */
        int price = 150000;

        if (price > 100000 && price < 300000) {
            System.out.println((int)(price*0.95));
        }
        else if (price > 300000 && price < 500000) {
            System.out.println((int)(price*0.9));
        }
        else if (price > 500000) {
            System.out.println((int)(price*0.8));
        }
        else {
            System.out.println(price);
        }
    }
}
