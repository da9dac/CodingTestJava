package ProgrammersLevelZero;

public class KCount {
    public static void main(String[] args) {
        //k의 개수
        int i = 3, j = 10, k = 2;
        int answer = 0;
        for (int x = i; x <= j; x++) {
            String s = String.valueOf(x);
            if(s.contains(String.valueOf(k))) {
                for (int y = 0; y < s.length(); y++) {
                    if(s.charAt(y) - '0' == k) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
