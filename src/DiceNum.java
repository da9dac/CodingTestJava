public class DiceNum {
    public static void main(String[] args) {
        // 주사위의 개수
        // 박스 배열의 인덱스는 각각 가로 세로 높이
        int[] box = {10, 8, 6};
        int n = 3;

        int x = box[0]/n;
        int y = box[1]/n;
        int z = box[2]/n;

        int answer = x*y*z;

        System.out.println(answer);
    }
}
