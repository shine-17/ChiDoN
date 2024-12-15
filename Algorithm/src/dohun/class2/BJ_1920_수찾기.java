package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1920_수찾기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            Map<Integer, Integer> source = new HashMap<>(n);
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                source.put(Integer.parseInt(st.nextToken()), 1);
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            List<Integer> target = new ArrayList<>(m);

            while(st.hasMoreTokens()) {
                target.add(Integer.parseInt(st.nextToken()));
            }

            StringBuilder result = new StringBuilder();

            for(Integer key : target) {
                result.append(source.getOrDefault(key, 0)).append("\n");
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
