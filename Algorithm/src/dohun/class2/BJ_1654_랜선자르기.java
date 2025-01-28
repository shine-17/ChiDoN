package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1654_랜선자르기 {
    static long[] lines;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            lines = new long[k];

            for(int i=0; i<k; i++) {
                lines[i] = Integer.parseInt(br.readLine());
            }

            long count = 0, mid = 0;
            long start = 1;
            long end = Arrays.stream(lines).max().orElse(0) + 1;

            // n : 11
            // 상한 -> n : 12 -> n보다 큰 값 중에 가장 작은 값
            // 하한 -> n : 10 -> n보다 작은 값 중에 가장 큰 값

            while (start < end) {
                mid = (start + end) / 2;
                count = cutLine(mid);

                if (count >= n) {
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            }

            System.out.println(start-1);

        } catch (Exception ignored) {}
    }

    static long cutLine(long length) {
        return Arrays.stream(lines).map(line -> line / length).sum();
    }
}
