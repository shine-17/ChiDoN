package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ_10828_스택 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> stack = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        try {

            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                String[] split = br.readLine().split(" ");

                String command = split[0];
                int num = split.length > 1 ? Integer.parseInt(split[1]) : 0;

                switch (command) {
                    case "push" -> stack.push(num);
                    case "pop" -> {
                        Integer pop = stack.isEmpty() ? -1 : stack.pop();
                        result.append(pop).append("\n");
                    }
                    case "size" -> result.append(stack.size()).append("\n");
                    case "empty" -> result.append(stack.isEmpty() ? 1 : 0).append("\n");
                    case "top" -> result.append(stack.peek() != null ? stack.peek() : -1).append("\n");
                }
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
