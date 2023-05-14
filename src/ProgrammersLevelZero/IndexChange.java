package ProgrammersLevelZero;

public class IndexChange {
    public static void main(String[] args) {
        // 인덱스 바꾸기
        String my_string = "I love you";
        int num1 = 3, num2 = 6;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer.append(my_string.charAt(num2));
            } else if (i == num2) {
                answer.append(my_string.charAt(num1));
            } else {
                answer.append(my_string.charAt(i));
            }
        }

        System.out.println(answer);
    }
}
