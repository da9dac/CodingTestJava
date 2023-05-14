package ProgrammersLevelOne;

import java.util.ArrayList;

public class BinaryPlusOneReverse {
    public static void main(String[] args) {
        // 3진법 뒤집기
        int n = 125;
        ArrayList<Integer> three = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        while (n != 0) {
            three.add(n % 3);
            n /= 3;
        }

        for(int i = 0; i < three.size(); i++) {
            str.append(three.get(i));
        }

        int answer = Integer.parseInt(str.toString(),3);
        System.out.println(answer);
    }
}
