package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ_10845_큐 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder result = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();

        try {

            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int num = st.hasMoreTokens()  ? Integer.parseInt(st.nextToken()) : -1;

                switch (command) {
                    case "push" -> queue.add(num);
                    case "pop" -> result.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    case "size" -> result.append(queue.size()).append("\n");
                    case "empty" -> result.append(queue.isEmpty() ? 1 : 0).append("\n");
                    case "front" -> result.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
                    case "back" -> result.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
                }
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
