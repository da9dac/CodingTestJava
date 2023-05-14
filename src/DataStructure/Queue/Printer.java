package DataStructure.Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};
        // 8

        Queue<Integer> line = new LinkedList<>();

        for (int  i = 0; i < bufferSize; i++) {
            line.offer(0);
        }

        int count = 0;
        int time = 0;

        while(count <= documents.length - 1) {
            int x = line.poll();
            if(line.peek() != null) {
                x = line.peek();
            }
            if(time % 2 == 0 && !line.isEmpty()) {
                line.poll();
            }
            if(line.size() < bufferSize && capacities - x >= documents[count]) {
                line.offer(documents[count]);
                count++;
            }

            time++;
        }

        System.out.println(time);
    }
}
