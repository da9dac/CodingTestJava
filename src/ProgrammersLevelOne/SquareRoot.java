package ProgrammersLevelOne;

public class SquareRoot {
    public static void main(String[] args) {
        long n = 121;
        long answer = 0;

        if(Math.sqrt(n) % 1 == 0) {
            answer = (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        } else {
            answer = -1;
        }

        System.out.println(answer);
    }
}
