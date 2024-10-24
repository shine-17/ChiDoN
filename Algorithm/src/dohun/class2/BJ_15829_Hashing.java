package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_15829_Hashing {
    static final BigInteger M = new BigInteger("1234567891");
    static final BigInteger r = new BigInteger("31"); // 1 + 62 + 2883 + 119164 + 4617605

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int L = Integer.parseInt(br.readLine());
            String str = br.readLine();
            System.out.println(hashing(str));

        } catch(Exception ignored) {}
    }

    static BigInteger hashing(String str) {
        BigInteger sum = new BigInteger("0");

        for(int i=0; i<str.length(); i++) {
            int n = str.charAt(i) - 96;

            BigInteger pow = r.pow(i);
            pow = pow.multiply(new BigInteger(String.valueOf(n)));

            sum = sum.add(pow);
        }

        return sum.remainder(M);
    }
}
