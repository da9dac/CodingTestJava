package ProgrammersLevelOne;

import java.util.Locale;

public class CountPandY {
    public static void main(String[] args) {
        // 문자열 내 p와 y의 개수
        String s = "Pyy";
        boolean answer = true;
        int p = 0, y  = 0;

        String[] arr = s.toLowerCase().split("");

        for(String a : arr) {
            if(a.equals("p")) {
                p++;
            } else if (a.equals("y")) {
                y++;
            }
        }

        if(p != y) {
            answer = false;
        }

        System.out.println(answer);
    }
}
