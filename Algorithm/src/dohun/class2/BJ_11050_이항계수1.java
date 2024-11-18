package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11050_이항계수1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int result = fac(n) / (fac((n - k)) * fac(k));
            System.out.println(result);


        } catch (Exception ignored) {}
    }

    static int fac(int n) {
        int result = 1;

        for(int i=1; i<=n; i++) {
            result *= i;
        }

        return result;
    }
}
