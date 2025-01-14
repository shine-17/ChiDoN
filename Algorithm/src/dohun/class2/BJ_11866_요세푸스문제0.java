package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_11866_요세푸스문제0 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            LinkedList<Integer> queue = new LinkedList<>();
            for (int i=1; i<=n; i++) {
                queue.add(i);
            }

            // k 번째마다 제거할 요소 순서
            int seq = 0;
            while (!queue.isEmpty()) {
                seq++;

                Integer poll = queue.poll();
                if (seq == k) {
                    set.add(poll);
                    seq = 0;
                }
                else {
                    queue.offer(poll);
                }
            }

            System.out.println(set.toString().replaceAll("\\[", "<").replaceAll("\\]", ">"));

        } catch (Exception ignored) {}
    }
}
