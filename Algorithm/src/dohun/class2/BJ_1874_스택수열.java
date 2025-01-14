package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;

public class BJ_1874_스택수열 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            LinkedList<Integer> stack = new LinkedList<>();
            StringBuilder commands = new StringBuilder();

            int[] sequences = new int[n];
            for (int i=0; i<n; i++) {
                sequences[i] = Integer.parseInt(br.readLine());
            }

            int curr = 1;
            boolean flag = true;

            for (Integer num : sequences) {
                if (!stack.contains(num)) {
                    for (int i=curr; i<=num; i++) {
                        stack.push(i);
                        commands.append("+").append("\n");
                    }

                    curr = num + 1;
                }

                while (true) {
                    commands.append("-").append("\n");

                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }

                    Integer pop = stack.pop();

                    if (Objects.equals(pop, num)) break;
                }
            }

            if (!flag) {
                System.out.println("NO");
            }
            else {
                System.out.println(commands);
            }

        } catch (Exception ignored) {}
    }
}


