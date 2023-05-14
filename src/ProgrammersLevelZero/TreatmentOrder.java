package ProgrammersLevelZero;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class TreatmentOrder {
    public static void main(String[] args) {
        //진료 순서 정하기
        int[] emergency = {30, 10, 23, 6, 100};
        int[] array = new int[emergency.length];
        System.arraycopy(emergency,0,array,0,emergency.length);
        Arrays.sort(array);
        int count = 0;

        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int x = 0; x < emergency.length; x++) {
                if (array[count] == emergency[x]) {
                    answer[x] = emergency.length - count;
                }
            }
            count++;
        }
        System.out.println(emergency[0]);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(answer));
    }
}
