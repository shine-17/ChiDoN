package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_11650_좌표정렬하기_1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {

            int n = Integer.parseInt(br.readLine());
            Point[] arr = new Point[n];

            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[i] = new Point(x, y);
            }

            Arrays.sort(arr, (o1, o2) -> {
                if (o1.x == o2.x) return o1.y - o2.y;
                return o1.x - o2.x;
            });

            StringBuilder sb = new StringBuilder();
            for(Point p : arr) {
                sb.append(p.x).append(" ").append(p.y).append("\n");
            }

            System.out.println(sb);

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
