package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1929_소수구하기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (m == 1) m = 2;

            for (int i=m; i<=n; i++) {
                if (checkPrimeNumber(i)) result.append(i).append("\n");
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }

    static boolean checkPrimeNumber(int num) {
        for (int i=2; i<=Math.sqrt(num); i++) { // 2 ~ n의 제곱근까지
            if (num % i == 0) return false;
        }

        return true;
    }
}
