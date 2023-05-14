package ProgrammersLevelOne;

public class CaesarPassword {
    public static void main(String[] args) {
        // 시저 암호
        String s = "AB";
        int n = 1;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(!(String.valueOf(s.charAt(i)).equals(" "))) {
                int x = 0;
                if(s.charAt(i) < 91 && s.charAt(i) + n > 90) {
                    x = (s.charAt(i) + n - 91) + 65;
                } else if (s.charAt(i) < 123 && s.charAt(i) + n > 122) {
                    x = (s.charAt(i) + n - 123) + 97;
                } else {
                    x = s.charAt(i) + n;
                }
                answer.append((char)x);
            } else {
                answer.append(" ");
            }
        }

        System.out.println(answer);
        System.out.println((int) 'a');
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
    }
}
