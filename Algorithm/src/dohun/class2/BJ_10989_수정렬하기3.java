package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_10989_수정렬하기3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            for(int i=0; i<n; i++) {
                int value = Integer.parseInt(br.readLine());
                arr[i] = value;
            }

            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();
            for(Integer num : arr) {
                sb.append(num).append("\n");
            }

            System.out.println(sb);

        } catch(Exception ignored) {}
    }
}
