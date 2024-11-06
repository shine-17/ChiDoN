package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2292_벌집 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            int seq = 0;
            int count = 0;

            for(int i=1; i<=Integer.MAX_VALUE; i+=seq) {
                count++;

                if(n <= i) break;

                seq += 6;
            }

            System.out.println(count);

        } catch(Exception ignored) {}
    }
}
