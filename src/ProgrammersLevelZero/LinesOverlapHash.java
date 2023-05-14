package ProgrammersLevelZero;

import java.util.*;

public class LinesOverlapHash {
    public static void main(String[] args) {
        int[][] lines = {{1, 2}, {2, 3}, {3, 4}};
//        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
        HashSet<Integer> la = new HashSet<>();
        HashSet<Integer> lb = new HashSet<>();
        HashSet<Integer> lc = new HashSet<>();
        int count = 0;

        for(int[] l : lines) {
            if(count == 0) {
                for(int i = l[0]; i <= l[1]; i++) {
                    la.add(i);
                }
            } else if(count == 1) {
                for(int i = l[0]; i <= l[1]; i++) {
                    lb.add(i);
                }
            } else {
                for(int i = l[0]; i <= l[1]; i++) {
                    lc.add(i);
                }
            }
            count++;
        }

        int[] x = la.stream()
                .filter(lb::contains)
                .mapToInt(a -> a)
                .toArray();
        int[] y = lb.stream()
                .filter(lc::contains)
                .mapToInt(a -> a)
                .toArray();
        int[] z = lc.stream()
                .filter(la::contains)
                .mapToInt(a -> a)
                .toArray();

        ArrayList<Integer> arr = new ArrayList<>();

        if(x.length >= 2) {
            for (int i : x) {
                arr.add(i);
            }
        }
        if(y.length >= 2) {
            for (int i : y) {
                if(!(arr.contains(i))) {
                    arr.add(i);
                }
            }
        }
        if(z.length >= 2) {
            for (int i : z) {
                if(!(arr.contains(i))) {
                    arr.add(i);
                }
            }
        }
        int answer = arr.size()-1;
        if(arr.size() % 2 == 0) {
            answer = arr.size()-2;
        }
        if(answer < 0) {
            answer = 0;
        }
        System.out.println(arr);
        System.out.println(answer);
    }
}
