package ProgrammersLevelOne;

import java.util.Arrays;

public class SeoulFindKSB {
    public static void main(String[] args) {
        // 서울에서 김서방 찾기
        String[] seoul = {"Jane", "Kim"};
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }

        System.out.println(answer);
    }
}
