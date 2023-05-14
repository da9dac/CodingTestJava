package ProgrammersLevelZero;

import java.util.Arrays;

public class MorseCodeA {
    public static void main(String[] args) {
        //모스부호 1

        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };

        String letter = ".... . .-.. .-.. ---";
        String[] letter_arr = letter.split(" ");

        StringBuilder answer = new StringBuilder();

        for (String letters : letter_arr) {
            for (int i = 0; i < morse.length; i++) {
                if(letters.equals(morse[i])) {
                    answer.append((char) (i + 97));
                }
            }
        }

        System.out.println(answer);//97
    }
}
