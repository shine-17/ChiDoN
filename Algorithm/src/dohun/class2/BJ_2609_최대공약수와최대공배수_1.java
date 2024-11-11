package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2609_최대공약수와최대공배수_1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            int a = 0, b = 0;
            if(n1 > n2) {
                a = n1;
                b = n2;
            }
            else {
                a = n2;
                b = n1;
            }

            // 최대 공약수
            int gcd = gcd(a, b);

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

    static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    static int lcm(int a, int b) {
        // 0이 아닌 두 수의 곱 / 두 수의 최대 공약수
        return a * b / gcd(a, b);
    }
}
