package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_2164_카드2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            Queue<Integer> q = new LinkedList<>();
            for(int i=1; i<=n; i++) {
                q.add(i);
            }

            int card = 0;
            while(!q.isEmpty()) {
                card = q.poll();

                if(q.isEmpty()) break;

                int bottomCard = q.poll();
                q.add(bottomCard);
            }

            System.out.println(card);

        } catch (Exception ignored) {}
    }
}
