package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_10816_숫자카드2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {

            HashMap<Integer, Integer> map = new HashMap<>();
            StringBuilder result = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                result.append(map.getOrDefault(num, 0)).append(" ");
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
