package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1978_소수찾기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int count = 0;
            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());

                int divideCount = 0;
                for(int i=1; i<=num; i++) {
                    if(num % i == 0) divideCount++;
                }

                if(divideCount == 2) count++;
            }

            System.out.println(count);

        } catch(Exception ignored) {}
    }
}
