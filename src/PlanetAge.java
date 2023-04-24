public class PlanetAge {
    public static void main(String[] args) {
        // 외계행성의 나이
        int age = 23;
        String str_age = String.valueOf(age);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str_age.length(); i++) {
            answer.insert(i,(char) (str_age.charAt(i)+49));
        }

        System.out.println(answer);
    }
}
