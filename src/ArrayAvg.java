public class ArrayAvg {
    public static void main(String[] args) {
        // 배열의 평균값
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0; //배열의 합

        for (int number : numbers) {
            // 배열을 전부 조회해서 더하기
            sum += number;
        }

        // 배열의 합을 배열의 길이로 나누기
        System.out.println((double)sum/numbers.length);
    }
}
