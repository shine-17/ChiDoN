package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BJ_9012_괄호 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int t = Integer.parseInt(br.readLine());
            ArrayDeque<Character> stack = new ArrayDeque<>();
            StringBuilder result = new StringBuilder();

            for (int i=0; i<t; i++) {
                String line = br.readLine();
                stack.clear();

                for (Character brackets : line.toCharArray()) {
                    if (brackets == '(') {
                        stack.push(brackets);
                    }
                    else if (brackets == ')') {
                        if (!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                        }
                        else {
                            stack.push(brackets);
                        }
                    }
                }

                result.append(stack.isEmpty() ? "YES" : "NO").append("\n");
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
