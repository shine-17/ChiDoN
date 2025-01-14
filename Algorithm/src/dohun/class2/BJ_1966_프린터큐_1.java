package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1966_프린터큐_1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringTokenizer st;
            StringBuilder result = new StringBuilder();
            LinkedList<Docs> docs = new LinkedList<>();

            int t = Integer.parseInt(br.readLine());

            for (int i=0; i<t; i++) {
                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                docs.clear();

                st = new StringTokenizer(br.readLine());
                for (int j=0; j<n; j++) {
                    docs.add(new Docs(j, Integer.parseInt(st.nextToken())));
                }

                Docs doc = docs.get(m);
                int seq = 0;

                while (!docs.isEmpty()) {
                    int max = docs.stream().max(Comparator.comparing(value -> value.priority)).get().priority;

                    Docs pop = docs.pop();

                    if (pop.priority == max) {
                        seq++;

                        if (doc.equals(pop)) break;
                    }
                    else {
                        docs.add(pop);
                    }
                }

                result.append(seq).append("\n");
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }

    static class Docs implements Comparator<Docs> {
        int index;
        int priority;

        public Docs(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        @Override
        public int compare(Docs o1, Docs o2) {
            return o1.priority - o2.priority;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Docs)) return false;

            Docs docs = (Docs) obj;

            return this.index == docs.index && this.priority == docs.priority;
        }
    }
}
