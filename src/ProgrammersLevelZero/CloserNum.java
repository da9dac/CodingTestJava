package ProgrammersLevelZero;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class CloserNum {
    public static void main(String[] args) {
        // 가까운 수
        int[] array = {11, 13};
        int n = 12;

        int[] array_new = new int[array.length+1];
        System.arraycopy(array, 0, array_new, 0, array.length);
        array_new[array_new.length - 1] = n;

        Arrays.sort(array_new);
        int x = binarySearch(array_new,n);
        System.out.println(Arrays.toString(array_new));
        if (x == 0) {
            System.out.println(array_new[x + 1]);

        } else {
            if(array_new.length - 1 == x) {
                System.out.println(array_new[x - 1]);
            } else if (array_new[x] - array_new[x - 1] <= array_new[x + 1] - array_new[x]) {
                System.out.println(array_new[x - 1]);
            }
            else {
                System.out.println(array_new[x + 1]);
            }
        }
    }
}
