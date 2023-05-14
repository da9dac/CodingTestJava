package ProgrammersLevelZero;

public class BinaryAdd {
    public static void main(String[] args) {
        // 이진수 더하기
        String bin1 = "1001";
        String bin2 = "1111";
        //parseInt는 진수변환도 가능
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int nn = num1+num2;
        String answer = Integer.toBinaryString(nn);

        System.out.println(nn);
        System.out.println(answer);
    }
}
