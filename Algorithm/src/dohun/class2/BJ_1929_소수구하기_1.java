package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1929_소수구하기_1 {
    static boolean[] primes;

    // 에라토스테네스의 체
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            primes = new boolean[n + 1];
            checkPrimeNumber();

            for (int i=m; i<=n; i++) {
                if (!primes[i]) result.append(i).append("\n");
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }

    static void checkPrimeNumber() {
        primes[0] = primes[1] = true; // 0, 1은 소수가 아니므로 제외

        for (int i=2; i<=Math.sqrt(primes.length); i++) { // 2 ~ n의 제곱근까지
            if (!primes[i]) { // 해당수가 소수면, 해당수를 제외한 배수들을 모두 false 처리
                for (int j=i*i; j<primes.length; j+=i) {
                    primes[j] = true;
                }
            }
        }
    }
}
