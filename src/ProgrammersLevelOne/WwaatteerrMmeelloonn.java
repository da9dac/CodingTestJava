package ProgrammersLevelOne;

public class WwaatteerrMmeelloonn {
    public static void main(String[] args) {
        // 수박수박수박수박수박수?
        int n = 3;
        StringBuilder answer = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer.append("박");
            } else {
                answer.append("수");
            }
        }

        System.out.println(answer);
    }
}
