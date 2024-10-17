package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_30802_웰컴키트 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> shirts = new ArrayList<>();

        try {
            // 참가자 수
            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                shirts.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int shirtCount = 0;

            for(Integer size : shirts) {
                shirtCount += (int) Math.ceil((double) size / t);
            }

            System.out.println(shirtCount);
            System.out.println(n / p + " " + n % p);

        } catch(Exception ignored) {}
    }
}
