package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_1676_팩토리얼0의개수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            int count = 0;

            String fac = factorial(n).toString();
            for(int i=fac.length()-1; i>=0; i--) {
                if(fac.charAt(i) != '0') break;

                count++;
            }

            System.out.println(count);

        } catch(Exception ignored) {}
    }

    static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");

        for(int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
