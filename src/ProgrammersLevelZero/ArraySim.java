package ProgrammersLevelZero;

public class ArraySim {
    public static void main(String[] args) {
        // 배열의 유사도
        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};
        int answer = 0;

        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
