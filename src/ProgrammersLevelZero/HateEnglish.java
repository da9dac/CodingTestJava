package ProgrammersLevelZero;

import java.util.ArrayList;

public class HateEnglish {
    public static void main(String[] args) {
        // 영어가 싫어요
        String numbers = "onefourzerosixseven";
        StringBuilder num = new StringBuilder();
        int x = 0;

        while (x < numbers.length()) {
            switch (numbers.charAt(x)) {
                case 'o': {
                    num.append("1");
                    x += 3;
                    break;
                }
                case 't': {
                    if (numbers.charAt(x + 1) == 'w') {
                        num.append("2");
                        x += 3;

                    } else {
                        num.append("3");
                        x += 5;
                    }
                    break;
                }
                case 'f': {
                    if (numbers.charAt(x + 1) == 'o') {
                        num.append("4");
                        x += 4;
                    } else {
                        num.append("5");
                        x += 4;
                    }
                    break;
                }
                case 's': {
                    if (numbers.charAt(x + 1) == 'i') {
                        num.append("6");
                        x += 3;
                    } else {
                        num.append("7");
                        x += 5;
                    }
                    break;
                }
                case 'e': {
                    num.append("8");
                    x += 5;
                    break;
                }
                case 'n': {
                    num.append("9");
                    x += 4;
                    break;
                }
                case 'z': {
                    num.append("0");
                    x += 4;
                    break;
                }
            }
//            if (x >= numbers.length()) {
//                break;
//            }
        }

        String a = num.toString();
        int b = Integer.parseInt(a);

        System.out.println(b);
    }
}
