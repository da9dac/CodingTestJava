package ProgrammersLevelZero;

public class StrInStr {
    public static void main(String[] args) {
        // 문자열안에 문자열
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        StringBuilder str = new StringBuilder();

        str.append(str1.replace(str2,""));

        if (str.toString().length() != str1.length()) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
