package ProgrammersLevelOne;

public class HarshadNumber {
    public static void main(String[] args) {
        // 하샤드 수
        int x = 12;
        boolean answer = true;
        int sum = 0;

        String str = String.valueOf(x);
        for(int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }

        if(x % sum != 0) {
            answer = false;
        }

        System.out.println(answer);
    }
}
