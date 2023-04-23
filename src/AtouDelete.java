public class AtouDelete {
    public static void main(String[] args) {
        // 모음 제거
        String my_string = "bus";
        StringBuilder answer = new StringBuilder();
        String[] atou = {"a","e","i","o","u"};

        //my_string 에서 aeiou를 제거
//        1. charAt
//        2. replace
        for (int i = 0; i < my_string.length(); i++) {
            for (int a = 0; a < atou.length; a++) {
                if (String.valueOf(my_string.charAt(i)).equals(atou[a])) {
                    break;
                }
                if (a == atou.length - 1) {
                    answer.append(my_string.charAt(i));
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
