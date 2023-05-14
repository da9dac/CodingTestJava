package ProgrammersLevelZero;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySculpture {
    public static void main(String[] args) {
        // 배열 조각하기
        int[] arr = {1, 7, 2, 3, 4, 5, };
        int[] query = {5,2};

        ArrayList<Integer> list = new ArrayList<>();

        for (int a : arr) {
            list.add(a);
        }
        //Ah...
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                while (list.size() > query[i] + 1) {
                    list.remove(query[i] + 1);
                }
            } else {
                for (int x = 0; x < query[i]; x++) {
                    list.remove(0);
                }
            }
        }
        int[] answer = list.stream()
                    .mapToInt(i -> i)
                    .toArray();
        System.out.println(Arrays.toString(answer));
    }
}
