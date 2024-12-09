package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BJ_11651_좌표정렬하기2_1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {

            PriorityQueue<Point> queue = new PriorityQueue<>((o1, o2) -> {
                if (o1.y == o2.y) return o1.x - o2.x;
                return o1.y - o2.y;
            });

            int n = Integer.parseInt(br.readLine());

            for(int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                queue.add(new Point(x, y));
            }

            StringBuilder result = new StringBuilder();
            while(!queue.isEmpty()) {
                Point point = queue.poll();
                result.append(point.x).append(" ").append(point.y).append("\n");
            }
            System.out.println(result);

        } catch (Exception ignored) {}
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
