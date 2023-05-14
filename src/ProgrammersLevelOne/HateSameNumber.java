package ProgrammersLevelOne;

import java.util.ArrayList;
import java.util.Arrays;

public class HateSameNumber {
    public static void main(String[] args) {
        // 같은 숫자는 싫어
        int[] arr = {4,4,4,3,3};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                list.add(arr[i]);
            }
            else if(!(arr[i] == arr[i+1])) {
                list.add(arr[i]);
            }
        }

        int[] answer = list.stream()
                        .mapToInt(a -> a)
                        .toArray();

        System.out.println(Arrays.toString(answer));
    }
}
