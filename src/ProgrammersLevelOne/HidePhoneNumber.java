package ProgrammersLevelOne;

public class HidePhoneNumber {
    public static void main(String[] args) {
        // 핸드폰 번호 가리기
        String phone_number = "027778888";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < phone_number.length(); i++) {
            if(i < phone_number.length() - 4) {
                answer.append("*");
            } else {
                answer.append(phone_number.charAt(i));
            }
        }

        System.out.println(answer);
    }
}
