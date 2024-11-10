package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2609_최대공약수와최대공배수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 최대 공약수
            int gcd = 0;
            for(int i=Math.min(a, b); i>=1; i--) {
                if(a % i == 0 && b % i == 0) {
                    gcd = i;
                    break;
                }
            }

            // 최대 공배수
            int lcm = 0;
            for(int i=Math.max(a, b); i<=a*b; i++) {
                if(i % a == 0 && i % b == 0) {
                    lcm = i;
                    break;
                }
            }

            System.out.println(gcd);
            System.out.println(lcm);

        } catch(Exception ignored) {}
    }
}
