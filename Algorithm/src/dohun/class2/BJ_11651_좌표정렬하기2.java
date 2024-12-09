package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BJ_11651_좌표정렬하기2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {

            TreeSet<Point> set = new TreeSet<>((o1, o2) -> {
                if (o1.y == o2.y) return o1.x - o2.x;
                return o1.y - o2.y;
            });

            int n = Integer.parseInt(br.readLine());

            for(int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                set.add(new Point(x, y));
            }

            StringBuilder result = new StringBuilder();
            for(Point p : set) {
                result.append(p.x).append(" ").append(p.y).append("\n");
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
