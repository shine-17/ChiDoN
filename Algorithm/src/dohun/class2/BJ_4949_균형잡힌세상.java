package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class BJ_4949_균형잡힌세상 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        try {

            String line;
            while (!(line = br.readLine()).equals(".")) {
                line = line.replaceAll("[^\\[|\\]|(|)]", "");
                ArrayDeque<Character> stack = new ArrayDeque<>();
                List<Character> stack1 = new LinkedList<>();

                for (Character brackets : line.toCharArray()) {
                    Character peek = stack.peek();

                    if(peek == null) {
                        stack.push(brackets);
                    }
                    else if (brackets == ')' && peek == '(') { // ()
                        stack.pop();
                    }
                    else if (brackets == ']' && peek == '[') { // []
                        stack.pop();
                    }
                    else {
                        stack.push(brackets);
                    }
                }

                result.append(stack.isEmpty() ? "yes" : "no").append("\n");
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
