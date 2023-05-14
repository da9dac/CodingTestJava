package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Default {
    public static void main(String[] args) {
        String[] input = {"","","",""};
        Queue<String> q = new LinkedList<>();

        for (String in : input) {
            q.offer(in);
        }

        String[] result = new String[q.size()];

        for (int i = 0; i < q.size(); i++) {
            result[i] = q.poll();
        }
    }
}
