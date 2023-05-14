package ProgrammersLevelZero;

import java.util.ArrayList;

public class ArrayRotation {
    public static void main(String[] args) {
        // 배열 회전시키기
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        ArrayList<Integer> answer = new ArrayList<Integer>();

        if(direction.equals("left")) {
            for (int i = 1; i < numbers.length; i++) {
                if (i == numbers.length-1) {
                    answer.add(numbers[i]);
                    answer.add(numbers[0]);
                } else {
                    answer.add(numbers[i]);
                }
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length-1) {
                    answer.add(0, numbers[i]);
                } else {
                    answer.add(numbers[i]);
                }
            }
        }
//        프로그래머스 사이트에서는 return 타입에 맞게 리턴해줘야해서
//        int형 배열로 바꿔줘야함
//        int[] result = new int[answer.size()];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = answer.get(i);
//        }
        System.out.println(answer);
    }
}
