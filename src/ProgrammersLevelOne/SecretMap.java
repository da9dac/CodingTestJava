package ProgrammersLevelOne;

import java.util.ArrayList;
import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        // [1차] 비밀지도
        int n = 16;
        int[] arr1 = {2147, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0,0, 0, 0, 0};
        int[] arr2 = {0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0,0, 0, 0, 1};

        long[] arrs1 = new long[arr1.length];
        long[] arrs2 = new long[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arrs1[i] = Long.parseLong(Long.toString(arr1[i], 2));
        }
        for (int i = 0; i < arr2.length; i++) {
            arrs2[i] = Long.parseLong(Long.toString(arr2[i], 2));
        }

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < arrs1.length; i++) {
            String s = String.valueOf(arrs1[i]);
            StringBuilder sb = new StringBuilder();
            if(s.length() < n) {
                for(int x = 0; x < n - s.length(); x++) {
                    sb.append("0");
                }
                sb.append(s);
            } else {
                sb.append(s);
            }
            list1.add(i, sb.toString());
        }

        for (int i = 0; i < arrs2.length; i++) {
            String s = String.valueOf(arrs2[i]);
            StringBuilder sb = new StringBuilder();
            if(s.length() < n) {
                for(int x = 0; x < n - s.length(); x++) {
                    sb.append("0");
                }
                sb.append(s);
            } else {
                sb.append(s);
            }
            list2.add(i, sb.toString());
        }

        String[] answer = new String[n];

        for (int i = 0; i < answer.length; i++) {
            StringBuilder sb = new StringBuilder();
            String a = list1.get(i);
            String b = list2.get(i);
            for(int x = 0; x < n; x++) {
                if(a.charAt(x) == '0' && b.charAt(x) == '0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(Arrays.toString(answer));
    }


}
