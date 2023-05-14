package ProgrammersLevelZero;

public class PizzaThree {
    public static void main(String[] args) {
        // 피자 나눠 먹기 (3)
        int slice = 4;
        int n = 12;
        System.out.println((n % slice == 0) ? n / slice : n / slice + 1);
    }
}
