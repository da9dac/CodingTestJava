package ProgrammersLevelZero;

import java.util.ArrayList;

public class SafeZone {
    public static void main(String[] args) {
        // 안전지대
        int[][] board = {{1}};
        int answer = 0;
        int n = board.length;
        int size = n * n;
        int count = 1;

        int[] zone = new int[size];
        ArrayList<Integer> bomb = new ArrayList<Integer>();

        for (int[] b : board) {
            for(int  i = 0; i < b.length; i++) {
                if(b[i] == 1) {
                    bomb.add(count);
                    count++;
                } else {
                    count++;
                }
            }
        }

        if(n == 1 && board[0][0] == 1) {
            answer = 0;
        } else {
            for (int i = 0; i < bomb.size(); i++) {
                int x = bomb.get(i);
                if (x % n != 0 && x % n != 1) {
                    if (!(x <= n)) {
                        for (int y = bomb.get(i) - n - 2; y <= bomb.get(i) - n; y++) {
                            zone[y] = 1;
                        }
                    }
                    for (int y = bomb.get(i) - 2; y <= bomb.get(i); y++) {
                        zone[y] = 1;
                    }
                    if (!(x > size - n)) {
                        for (int y = bomb.get(i) + n - 2; y <= bomb.get(i) + n; y++) {
                            zone[y] = 1;
                        }
                    }
                } else if (x % n == 0) {
                    if (!(x <= n)) {
                        for (int y = bomb.get(i) - n - 2; y < bomb.get(i) - n; y++) {
                            zone[y] = 1;
                        }
                    }
                    for (int y = bomb.get(i) - 2; y < bomb.get(i); y++) {
                        zone[y] = 1;
                    }
                    if (!(x > size - n)) {
                        for (int y = bomb.get(i) + n - 2; y < bomb.get(i) + n; y++) {
                            zone[y] = 1;
                        }
                    }
                } else {
                    if (!(x <= n)) {// 16
                        for (int y = bomb.get(i) - n - 1; y <= bomb.get(i) - n; y++) {
                            zone[y] = 1;
                        }
                    }
                    for (int y = bomb.get(i) - 1; y <= bomb.get(i); y++) {
                        zone[y] = 1;
                    }
                    if (!(x > size - n)) {
                        for (int y = bomb.get(i) + n - 1; y <= bomb.get(i) + n; y++) {
                            zone[y] = 1;
                        }
                    }
                }
            }
            for(int z : zone) {
                if(z == 0) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
