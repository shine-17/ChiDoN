package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class BJ_18110_solved_ac {
    static final double TRIMMED_MEAN = 0.15;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        try {

            LinkedList<Integer> levelQueue = new LinkedList<>();

            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                int level = Integer.parseInt(br.readLine());
                levelQueue.add(level);
            }

            if (n == 0) {
                result.append(0);
            }
            else {
                // 큰 값, 작은 값 제외하고 평균을 내는 절사평균을 하기 위해 정렬
                Collections.sort(levelQueue);

                // 절사평균값
                long trimmed = Math.round(levelQueue.size() * TRIMMED_MEAN);
                for (int i=0; i<trimmed; i++) {
                    levelQueue.pollFirst();
                    levelQueue.pollLast();
                }

                double asDouble = levelQueue.stream()
                        .mapToInt(Integer::intValue).average().orElseThrow();
                result.append(Math.round(asDouble));
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
