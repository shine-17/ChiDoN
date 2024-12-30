package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BJ_10773_제로 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        try {

            int k = Integer.parseInt(br.readLine());
            for (int i=0; i<k; i++) {
                int n = Integer.parseInt(br.readLine());

                if (n != 0) {
                    stack.push(n);
                }
                else {
                    stack.pop();
                }
            }

            int sum = stack.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum);

        } catch (Exception ignored) {}
    }
}