public class HeightThan {
    public static void main(String[] args) {
        // 머쓱이보다 키 큰 사람
        int[] array = {149,180,192,170};
        //int[] array = {180,120,140};
        int height = 167;
        int result = 0;

        for (int key : array) {
            if (key > height) {
                result++;
            }
        }

        System.out.println(result);
    }
}
