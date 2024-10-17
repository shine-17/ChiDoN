package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2231_분해합 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            int cons = 0;

            for(int i=1; i<=n; i++) {
                int sum = i;

                String numStr = String.valueOf(i);
                for(int j=0; j<numStr.length(); j++) {
                    sum += numStr.charAt(j) - '0';
                }

                if(sum == n) {
                    cons = i;
                    break;
                }
            }

            System.out.println(cons);

        } catch(Exception ignored) {}
    }
}
