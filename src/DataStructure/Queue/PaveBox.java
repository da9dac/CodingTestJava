package DataStructure.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PaveBox {
    public static void main(String[] args) {
        Integer[] boxes = {5, 1, 4, 3, 6, 4, 2, 1,5};
        Queue<Integer> line = new LinkedList<>();

        for(Integer box : boxes) {
            line.offer(box);
        }

        while (line.size() > 0) {
            int first = line.poll();
            int count = 1;
        }

//        ArrayList<Integer> arr = new ArrayList<>();
//        int array = 0;
//
//        while (!(line.isEmpty())) {
//            int first = line.poll();
//            int count = 1;
//            while (!(line.isEmpty()) && first >= line.peek()) {
//                count++;
//                line.poll();
//            }
//            arr.add(array, count);
//        }
//
//        int[] arrs = arr.stream()
//                .mapToInt(i -> i)
//                .sorted()
//                .toArray();

//        System.out.println(arrs[arrs.length - 1]);
//        System.out.println(Arrays.toString(arrs));
    }
}
