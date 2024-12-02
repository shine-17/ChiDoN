package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1436_영화감독숌 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            int seq = 0; // 순서
            int i = 665; // 종말의 수 찾기
            while(seq != n) {
                i++;

                if(String.valueOf(i).contains("666")) {
                    seq++;
                }
            }

            System.out.println(i);

        } catch(Exception ignored) {}
    }
}

