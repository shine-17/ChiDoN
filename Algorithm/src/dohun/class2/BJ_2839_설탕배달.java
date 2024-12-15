package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2839_설탕배달 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            int result = 0;

            if(n % 5 == 0) result = n / 5;
            else {
                int i = n / 5;

                while(i >= 0) {
                    if((n - (5 * i)) % 3 == 0) {
                        result = i + ((n - (5 * i)) / 3);
                        break;
                    }

                    i--;
                }

                result = result != 0 ? result : -1;
            }

            System.out.println(result);

        } catch (Exception ignored) {}
    }
}
