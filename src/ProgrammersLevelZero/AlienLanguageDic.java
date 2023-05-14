package ProgrammersLevelZero;

public class AlienLanguageDic {
    public static void main(String[] args) {
        // 외계어 사전
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        int answer = 2;

        for (String d : dic) {
            int count = spell.length;
            for (int i = 0; i < spell.length; i++) {
                if (d.contains(spell[i])) {
                    count--;
                }
            }
            if (count ==  0) {
                answer = 1;
                break;
            }
        }

        System.out.println(answer);
    }
}
