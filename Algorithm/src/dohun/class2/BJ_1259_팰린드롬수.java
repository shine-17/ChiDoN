package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1259_팰린드롬수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringBuilder sb = new StringBuilder();
            while(true) {
                String num = br.readLine();

                if(num.equals("0")) break;

                boolean isPalindrome = true;
                for(int i=0; i<num.length() / 2; i++) {
                    if(num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }

                sb.append(isPalindrome ? "yes" : "no").append("\n");
            }

            System.out.println(sb);

        } catch(Exception ignored) {}
    }
}
