package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2108_통계학 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        try {

            HashMap<Integer, Integer> map = new HashMap<>();
            LinkedList<Integer> nums = new LinkedList<>();
            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                Integer num = Integer.parseInt(br.readLine());
                nums.add(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // 산술평균
            double avg = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
            long num1 = Math.round(avg);
            result.append(num1).append("\n");

            // 중앙값
            Collections.sort(nums);
            int num2 = nums.get(nums.size() / 2);
            result.append(num2).append("\n");

            // 최빈값
            List<Integer> list = new ArrayList<>();
            int max = map.values().stream().max(Integer::compareTo).get();

            for (Integer key : map.keySet()) {
                int val = map.get(key);

                if (val == max) list.add(key);
            }

            Collections.sort(list);
            int num3 = list.size() > 1 ? list.get(1) : list.get(0);

            result.append(num3).append("\n");

            // 범위
            int num4 = nums.size() > 1 ? nums.pollLast() - nums.pollFirst() : 0;
            result.append(num4).append("\n");

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
