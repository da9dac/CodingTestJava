package ProgrammersLevelZero;

public class RSP {
    public static void main(String[] args) {
        // 가위 바위 보
        // 2 0 5

        String rsp = "2";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            int x = rsp.charAt(i)-'0';
            switch (x) {
                case 2: answer.append(0); break;
                case 0: answer.append(5); break;
                case 5: answer.append(2); break;
            }
        }

        System.out.println(answer.toString());
    }
}
